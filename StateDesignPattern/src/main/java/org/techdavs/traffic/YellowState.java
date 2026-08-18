package org.techdavs.traffic;

public class YellowState extends TrafficState {
    @Override
    public void action(TrafficSignal signal) {
        System.out.println("(YELLOW) STAY_90 HERE AND SET: RED STATE");
        signal.setState(new RedState());
    }
}
