package DesignPatterns.StrategyDesignPattern.withStrategyDesignPattern;

public class PassengerVechicle extends Vechicle {
    public PassengerVechicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
