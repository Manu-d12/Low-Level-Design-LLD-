package org.example;

public class ExternalDispatcher {
    ElevatorSchedular elevatorSchedular;

    public ExternalDispatcher(ElevatorSchedular schedular) {
        this.elevatorSchedular = schedular;
    }

    public ElevatorCar submitExternalRequest(Request request) {
        ElevatorController elevatorController = this.elevatorSchedular.findElevatorController(request);
        elevatorController.submitRequest(request.floor);
        return elevatorController.elevatorCar;
    }
}
