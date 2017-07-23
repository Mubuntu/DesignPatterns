package weatherobservable;

import java.util.*;

/**
 * Created by patrick on 7/23/2017.
 */
public class StatisticsDisplay implements java.util.Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
       this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + this.tempSum / (float) this.numReadings + "/" + this.maxTemp + "/" + this.minTemp);
        System.out.println("=========================================");

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            this.tempSum += temp;
            ++this.numReadings;
            if (temp > this.maxTemp) {
                this.maxTemp = temp;
            }
            if (temp < this.minTemp) {
                this.minTemp = temp;
            }
            this.display();
        }
    }
}
