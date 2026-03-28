package org.example;

import java.util.concurrent.PriorityBlockingQueue;

public class ElevatorController implements Runnable {
    ElevatorCar elevatorCar;
    int id;
    PriorityBlockingQueue<Integer> upMinPQ = new PriorityBlockingQueue<>();
    PriorityBlockingQueue<Integer> downMaxPQ = new PriorityBlockingQueue<>(10, (a, b) -> b - a);
    final Object monitor = new Object();

    public ElevatorController(int id, ElevatorCar elevatorCar) {
        this.id = id;
        this.elevatorCar = elevatorCar;
    }

    public void submitRequest(int destinationFloor) {
        this.enqueueRequest(destinationFloor);
    }

    private void enqueueRequest(int destFloor) {
        synchronized (monitor) {
            if(this.elevatorCar.nextStoppageFloor == destFloor) return;
            if(this.elevatorCar.nextStoppageFloor > destFloor) {
                if(!downMaxPQ.contains(destFloor)) downMaxPQ.add(destFloor);
            } else {
                if(!upMinPQ.contains(destFloor)) upMinPQ.add(destFloor);
            }
            monitor.notify(); // wake elevator thread
        }
    }

    @Override
    public void run() {
        this.controlElevator();
    }

    public void controlElevator() {
        while (true) {
            //no request, go to sleep
            synchronized (monitor) {
                while (upMinPQ.isEmpty() && downMaxPQ.isEmpty()) {
                    try {
                        System.out.println("elevator:" + elevatorCar.id + " is IDLE");
                        elevatorCar.elevatorDirection = ElevatorDirection.IDLE;
                        monitor.wait(); // sleep until request arrives
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            System.out.println("UpMinPQ " + upMinPQ);
            System.out.println("DownMaxPQ " + downMaxPQ);

            while (!upMinPQ.isEmpty()) {
                int floor = upMinPQ.poll();
                System.out.println("Serving floor: " + floor + " by elevator: " + elevatorCar.id + " currentFloor: " + elevatorCar.currentFloor);
                elevatorCar.moveElevator(floor);
            }

            while (!downMaxPQ.isEmpty()) {
                int floor = downMaxPQ.poll();
                System.out.println("Serving floor: " + floor + " by elevator: " + elevatorCar.id + " currentFloor: " + elevatorCar.currentFloor);
                elevatorCar.moveElevator(floor);
            }
        }
    }

}
