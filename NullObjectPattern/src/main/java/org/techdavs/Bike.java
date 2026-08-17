package org.techdavs;

public class Bike implements Vechicle {

    private int speed = 0;

    @Override
    public void start() {
        System.out.println("BIKE STARTED");
        this.speed = 20;
    }

    @Override
    public void stop() {
        System.out.println("BIKE STOPPED");
        this.speed = 0;
    }
}
