package org.techdavs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vechicle car = VechileFactory.getVechicle("CAR");
        Vechicle bike = VechileFactory.getVechicle("BIKE");
        Vechicle truck = VechileFactory.getVechicle("TRUCK");


        car.start();
        car.stop();

        bike.start();
        bike.stop();

        // without nullobjectpattern this will always throw exception..
        truck.start();
        truck.stop();

    }
}
