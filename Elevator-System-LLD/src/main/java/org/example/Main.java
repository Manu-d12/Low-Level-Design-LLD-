package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            ElevatorCar elevatorCar1 = new ElevatorCar(1);
            ElevatorCar elevatorCar2 = new ElevatorCar(2);

            ElevatorController elevatorController1 = new ElevatorController(10, elevatorCar1);
            ElevatorController elevatorController2 = new ElevatorController(20, elevatorCar2);

            InternalButton internalButton1 = new InternalButton(elevatorController1);
            InternalButton internalButton2 = new InternalButton(elevatorController2);

            ElevatorSelectionStrategy elevatorSelectionStrategy = new LeastBusyElevatorStrategy();
            ElevatorSchedular elevatorSchedular = new ElevatorSchedular(List.of(elevatorController1, elevatorController2), elevatorSelectionStrategy);

            ExternalDispatcher externalDispatcher = new ExternalDispatcher(elevatorSchedular);

            Building building = new Building(8, externalDispatcher);

            Thread elevatorControllerThread_1 = new Thread(elevatorController1);
            Thread elevatorControllerThread_2 = new Thread(elevatorController2);

            elevatorControllerThread_1.start();
            elevatorControllerThread_2.start();


            building.getFloor(3).pressUpButton();
            Thread.sleep(200);


            building.getFloor(5).pressUpButton();
            Thread.sleep(200);


        } catch (Exception ignored){}

    }
}

