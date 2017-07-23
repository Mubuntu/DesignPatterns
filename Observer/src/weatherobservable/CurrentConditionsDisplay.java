package weatherobservable;

import java.util.Observable;

/**
 * Created by patrick on 7/23/2017.
 */
public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object args) {

        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        //prints out most recent temp + humidity
        System.out.println("Current Conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
        System.out.println("=========================================");

    }
}
