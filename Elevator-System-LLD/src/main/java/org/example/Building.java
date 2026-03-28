package org.example;

import java.util.ArrayList;
import java.util.List;

public class Building {
    List<Floor> floorList;

    public Building(int floors, ExternalDispatcher dispatcher) {
        this.floorList = new ArrayList<>();
        for(int i = 1; i <= floors; ++i) {
            floorList.add(new Floor(i, dispatcher));
        }
    }

    public Floor getFloor(int id) {
        return floorList.get(id - 1);
    }
}
