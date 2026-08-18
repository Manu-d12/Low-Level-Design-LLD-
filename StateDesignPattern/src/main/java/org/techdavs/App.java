package org.techdavs;

import org.techdavs.traffic.GreenState;
import org.techdavs.traffic.TrafficSignal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        TrafficSignal signal = new TrafficSignal(new GreenState());
        signal.change();
        signal.change();
        signal.change();

    }
}
