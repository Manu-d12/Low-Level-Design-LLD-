package org.example;

import java.util.List;

public class NearestElevatorStrategy implements ElevatorSelectionStrategy{
    @Override
    public ElevatorController selectElevatorController(List<ElevatorController> controllers, Request req) {
        return controllers.getFirst();
    }
}
