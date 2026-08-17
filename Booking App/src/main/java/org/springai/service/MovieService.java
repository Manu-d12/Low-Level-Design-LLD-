package org.springai.service;

import org.springai.enitties.Movie;
import org.springai.enitties.Show;
import org.springai.enitties.Theater;
import org.springai.enums.City;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private final TheaterService theaterService;

   public MovieService(TheaterService theaterService) {
       this.theaterService = theaterService;
   }

    public List<Movie> getAllMoviesByCity(
            City city
    ) {
        // get all the theaters in that city and search the movies in the theaters and return the result
        List<Theater> cityTheaters = this.theaterService.findByCity(city);

        return new ArrayList<>(cityTheaters.stream()
                // Theater -> its List<Screen>; flatMap flattens all screens of all theaters into one stream
                .flatMap(theater -> theater.getScreens().stream())
                // Screen -> its List<Show>; flatMap flattens all shows of all screens into one stream
                .flatMap(screen -> screen.getShows().stream())
                // Show -> the Movie playing in it
                .map(Show::getMovie)
                // a movie can play in many shows/screens/theaters, so de-duplicate by id
                .collect(Collectors.toMap(
                        Movie::getId,   // key: unique movie id
                        movie -> movie, // value: the movie itself
                        (existing, duplicate) -> existing // on id clash, keep the first one
                ))
                .values());
    }
}
  