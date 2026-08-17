package org.springai.enitties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springai.enums.City;

import java.util.List;

@Setter
@AllArgsConstructor
@Getter
public class Theater {

    private int id;

    private City city;

    List<Screen> screens;
}
