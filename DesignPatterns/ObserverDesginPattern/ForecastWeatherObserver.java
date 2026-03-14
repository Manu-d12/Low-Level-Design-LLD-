package DesignPatterns.ObserverDesginPattern;

public class ForecastWeatherObserver implements WeatherObserver{
    
    @Override
    public void update(int temperature) {
        System.out.println("ForecastWeatherObserver : Temperature is  " + temperature);
    } 
}
