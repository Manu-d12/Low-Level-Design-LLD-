package org.techdavs;

public class VechileFactory {

    public static Vechicle getVechicle(String type) {
        if(type.equals("CAR")) {
            return new Car();
        } else if(type.equals("BIKE")) {
            return new Bike();
        } else {
//            return null; // first part of the problem
            return new NullVechicle();
        }
    }
}
