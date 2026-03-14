package DesignPatterns.ObserverDesginPattern;

public class CurrentConditionDisplayObserver implements WeatherObserver {
    @Override
    public void update(int temperature) {
        System.out.println("CurrentConditionDisplayObserver: Temperature is " + temperature);
    }
}
