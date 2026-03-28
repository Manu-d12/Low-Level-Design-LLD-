package org.example;

public class InternalButton {
    ElevatorController controller;

    public InternalButton(ElevatorController controller) {
        this.controller = controller;
    }

    void pressButton(int floor) {
        this.controller.submitRequest(floor);
    }
}
