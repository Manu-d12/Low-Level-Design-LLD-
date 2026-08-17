package org.springai.service;

import org.springai.enitties.Theater;
import org.springai.enums.City;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TheaterService {

    private final Map<City, List<Theater>> cityTheaterMap;

    public TheaterService (Map<City, List<Theater>> cityTheaterMap) {
        this.cityTheaterMap = cityTheaterMap;
    }

    public List<Theater> findByCity(City city) {
        return this.cityTheaterMap.getOrDefault(city, new ArrayList<>());
    }
}
