package org.techdavs.traffic;

public class TrafficSignal {
    private TrafficState state;

    public TrafficSignal() {
        this.setState(new RedState());
    }

    public TrafficSignal(TrafficState state) {
        this.setState(state);
    }

    public void setState(TrafficState state) {
        this.state = state;
    }

    public void change() {
        state.action(this);
    }
}
