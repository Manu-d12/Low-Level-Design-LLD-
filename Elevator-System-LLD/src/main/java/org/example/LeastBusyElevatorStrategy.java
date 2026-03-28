package org.example;

import java.util.List;

public class LeastBusyElevatorStrategy implements ElevatorSelectionStrategy{
    @Override
    public ElevatorController selectElevatorController(List<ElevatorController> controllers, Request req) {
        ElevatorController leastBusyElevator = null;
        int load = Integer.MAX_VALUE;

        for(ElevatorController controller : controllers) {
            int controllerLoad = controller.upMinPQ.size() + controller.downMaxPQ.size();
            if(controllerLoad < load) {
                load = controllerLoad;
                leastBusyElevator = controller;
            }
        }
        return leastBusyElevator;
    }
}
