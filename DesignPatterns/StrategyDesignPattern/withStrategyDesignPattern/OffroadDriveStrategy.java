package DesignPatterns.StrategyDesignPattern.withStrategyDesignPattern;

public class OffroadDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capabiltity : Offroad");
    }
}
