package DesignPatterns.StrategyDesignPattern.withStrategyDesignPattern;

public class SportsVechicle extends Vechicle {
    public SportsVechicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
