package weatherobservable;

import java.util.*;

/**
 * Created by patrick on 7/23/2017.
 */
public class ForecastDisplay implements java.util.Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("more of the same.");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
            System.out.println("=========================================");

        }
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
