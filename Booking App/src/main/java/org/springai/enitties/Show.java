package org.springai.enitties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@AllArgsConstructor
@Getter
public class Show {

    private int id;

    private Movie movie;

    private LocalDateTime localDateTime;
}
