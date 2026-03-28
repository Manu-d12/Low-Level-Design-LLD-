package org.example;

public class Request {
    int floor;
    ElevatorDirection elevatorDirection;

    public Request(int floor, ElevatorDirection direction) {
        this.floor = floor;
        this.elevatorDirection = direction;
    }
}
