package org.springai.enitties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@AllArgsConstructor
@Getter
public class Screen {

    private int id;

    private List<Seat> seats;

    private List<Show> shows;
}
