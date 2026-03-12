package DesignPatterns.StrategyDesignPattern.withStrategyDesignPattern;

public class Demo {
    public static void main(String[] args) {
        DriveStrategy spDriveStrategy = new SportsDriveStrategy();
        DriveStrategy offRoadDriveStrategy = new OffroadDriveStrategy();


        Vechicle vechicle = new SportsVechicle(spDriveStrategy);
        vechicle.drive();

        vechicle = new SportsVechicle(offRoadDriveStrategy);
        vechicle.drive();
    }
}
