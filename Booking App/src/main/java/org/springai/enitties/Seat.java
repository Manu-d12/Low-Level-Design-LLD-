package org.springai.enitties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springai.enums.SeatCategory;

@Setter
@AllArgsConstructor
@Getter
public class Seat {

    private int id;

    private SeatCategory category;
}
