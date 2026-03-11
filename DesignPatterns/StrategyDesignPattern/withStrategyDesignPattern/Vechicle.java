package DesignPatterns.StrategyDesignPattern.withStrategyDesignPattern;

public class Vechicle {
    private DriveStrategy driveStrategy;

    public Vechicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
}