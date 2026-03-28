package org.example;

import java.util.List;

public class ElevatorSchedular {
    List<ElevatorController> controllers;
    ElevatorSelectionStrategy strategy;

    public ElevatorSchedular(List<ElevatorController> controllers, ElevatorSelectionStrategy strategy) {
        this.controllers = controllers;
        this.strategy = strategy;
    }

    public ElevatorController findElevatorController(Request req) {
       return strategy.selectElevatorController(controllers, req);
    }
}
