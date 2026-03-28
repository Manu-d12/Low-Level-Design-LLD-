package org.example;

public class Door {
    private DoorState doorState;

    Door() {
        doorState = DoorState.CLOSE;
    }

    public void openDoor(int id) {
        doorState = DoorState.OPEN;
        System.out.println("Opening the Elevator door of elevator:" + id);
    }

    public void closeDoor(int id) {
        doorState = DoorState.CLOSE;
        System.out.println("Closing the Elevator door of elevator:" + id);
    }

}
