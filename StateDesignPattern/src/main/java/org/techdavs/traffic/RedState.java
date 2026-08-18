package org.techdavs.traffic;

public class RedState extends TrafficState {
    @Override
    public void action(TrafficSignal signal) {
        System.out.println("(RED) STAY_90 HERE AND SET: GREEN STATE");
        signal.setState(new GreenState());
    }
}
