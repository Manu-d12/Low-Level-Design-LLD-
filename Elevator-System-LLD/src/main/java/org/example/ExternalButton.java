package org.example;

public class ExternalButton {
    ExternalDispatcher dispatcher;

    public ExternalButton(ExternalDispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    void pressButton(int floor, ElevatorDirection direction) {
        ElevatorCar elevatorCar = dispatcher.submitExternalRequest(new Request(floor, direction));
        System.out.println("Elevator with id: " + elevatorCar.id + " coming...");
    }
}
