package DesignPatterns.StrategyDesignPattern.withoutStrategyDesignPattern;


public class Demo {
    public static void main(String[] args) {
        System.out.println("Vehicle Drive Modes: Problem Demo");
        Vechicle vehicle;

        // Sports vehicle - sports drive mode
        vehicle = new SportsVechicle();
        vehicle.drive();

        //goods vehicle - sports goods mode
        vehicle = new GoodsVechicle();
        vehicle.drive();

        // Passenger vehicle - normal drive mode
        vehicle = new PassengerVechicle();
        vehicle.drive();

    }
}
