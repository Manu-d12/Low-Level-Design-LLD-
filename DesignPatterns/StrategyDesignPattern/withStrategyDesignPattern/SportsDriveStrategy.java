package DesignPatterns.StrategyDesignPattern.withStrategyDesignPattern;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capabiltity : Sports");
    }
}
