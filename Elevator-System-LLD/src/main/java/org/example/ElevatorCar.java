package org.example;

import java.sql.SQLOutput;

public class ElevatorCar {
    int id;
    int currentFloor;
    int nextStoppageFloor;
    ElevatorDirection elevatorDirection;
    Door door;

    public ElevatorCar(int id) {
        this.id = id;
        this.currentFloor = 1;
        this.nextStoppageFloor = 1;
        this.elevatorDirection = ElevatorDirection.IDLE;
        door = new Door();
    }


    public void moveElevator(int destinationFloor) {
        this.nextStoppageFloor = destinationFloor;

        if(this.currentFloor == this.nextStoppageFloor) {
            door.openDoor(id);
            return;
        }
        door.closeDoor(id);
        if(this.nextStoppageFloor > this.currentFloor) {
            this.elevatorDirection = ElevatorDirection.UP;
            for (int i = currentFloor + 1; i <= this.nextStoppageFloor; ++i) {
                try {
                    Thread.sleep(10);
                } catch (Exception ignored) {

                }
                this.currentFloor = i;
                showDisplay();
            }
        } else {
            this.elevatorDirection = ElevatorDirection.DOWN;
            for (int i = currentFloor - 1; i >= this.nextStoppageFloor; --i) {
                try {
                    Thread.sleep(10);
                } catch (Exception ignored) {

                }
                this.currentFloor = i;
                showDisplay();
            }
        }
        door.openDoor(this.id);
        elevatorDirection = ElevatorDirection.IDLE;
    }

    public void showDisplay() {
        System.out.println("elevator:" + id + " Current floor: " + currentFloor + " going: " + elevatorDirection);
    }

}
