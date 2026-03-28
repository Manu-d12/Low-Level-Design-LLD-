package org.example;

import java.util.List;

public interface ElevatorSelectionStrategy {
    ElevatorController selectElevatorController(List<ElevatorController> controllers, Request req);
}
