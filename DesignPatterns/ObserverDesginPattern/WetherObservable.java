package DesignPatterns.ObserverDesginPattern;

public interface WetherObservable {
    void addObserver(WeatherObserver observer);
    void removeOberser(WeatherObserver observer);
    void notifyAllObservers();
    void setState(int temperature);
}