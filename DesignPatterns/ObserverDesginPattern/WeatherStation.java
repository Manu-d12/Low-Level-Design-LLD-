package DesignPatterns.ObserverDesginPattern;

import java.util.ArrayList;
import java.util.List;
public class WeatherStation implements WetherObservable {

    private int temperature;
    private List<WeatherObserver> observersList = new ArrayList<>();

    @Override
    public void addObserver(WeatherObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void removeOberser(WeatherObserver observer) { 
        observersList.remove(observer);
    }    

    @Override
    public void notifyAllObservers() {
        for(WeatherObserver observer : this.observersList) {
            observer.update(this.temperature);
        }
    }

    @Override
    public void setState(int temperature) {
        this.temperature = temperature;
        this.notifyAllObservers();
    }    
}
