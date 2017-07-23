package weatherobservable;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by patrick on 7/23/2017.
 */
public class WeatherData extends Observable {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }


    public void measurementsChanged() {
        setChanged();
        notifyObservers();
        //pull model, er wordt geen data object meegegeven
        //bij een push model stuur je nog een data object mee
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}