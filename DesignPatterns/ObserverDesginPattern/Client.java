package DesignPatterns.ObserverDesginPattern;

public class Client {
    public static void main(String[] args) {
        WeatherObserver conditionDisplayObserver = new CurrentConditionDisplayObserver();
        WeatherObserver forecastObserver = new ForecastWeatherObserver();

        WetherObservable weatherObservable = new WeatherStation();
        weatherObservable.addObserver(forecastObserver);
        weatherObservable.addObserver(conditionDisplayObserver);

        weatherObservable.setState(40);
        weatherObservable.setState(20);
    }
}
