package org.techdavs.traffic;

public class GreenState extends TrafficState {
    @Override
    public void action(TrafficSignal signal) {
        System.out.println("(GREEN) STAY_90 HERE AND SET: YELLOW STATE");
        signal.setState(new YellowState());
    }
}
