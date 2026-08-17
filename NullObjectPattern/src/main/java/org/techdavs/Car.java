package org.techdavs;

public class Car implements Vechicle {

    private int speed = 0;

    @Override
    public void start() {
        System.out.println("CAR STARTED");
        this.speed = 90;
    }

    @Override
    public void stop() {
        System.out.println("CAR STOPPED");
        this.speed = 0;
    }
}
