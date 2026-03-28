package org.example;

public class Floor {
    int floorNumber;
    ExternalButton upButton;
    ExternalButton downButton;

    public Floor(int floorNumber, ExternalDispatcher dispatcher) {
        this.floorNumber = floorNumber;
        upButton = new ExternalButton(dispatcher);
        downButton = new ExternalButton(dispatcher);
    }

    public void pressDownButton() {
        downButton.pressButton(this.floorNumber, ElevatorDirection.DOWN);
    }

    public void pressUpButton() {
        upButton.pressButton(floorNumber, ElevatorDirection.UP);
    }
}
