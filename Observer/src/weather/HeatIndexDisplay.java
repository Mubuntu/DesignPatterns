package weather;

/**
 * Created by Patrick on 23/07/2017.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    float heatIndex = 0.0F;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float t, float rh, float pressure) {
        this.heatIndex = this.computeHeatIndex(t, rh);
        this.display();
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float) (16.923D + 0.185212D * (double) t + 5.37941D * (double) rh - 0.100254D
                * (double) t * (double) rh + 0.00941695D * (double) (t * t) + 0.00728898D * (double) (rh * rh) + 3.45372E-4D *
                (double) (t * t * rh) - 8.14971E-4D * (double) (t * rh * rh) + 1.02102E-5D * (double) (t * t * rh * rh) - 3.8646E-5D
                * (double) (t * t * t) + 2.91583E-5D * (double) (rh * rh * rh) + 1.42721E-6D * (double) (t * t * t * rh) + 1.97483E-7D
                * (double) (t * rh * rh * rh) - 2.18429E-8D * (double) (t * t * t * rh * rh) + 8.43296E-10D * (double) (t * t * rh * rh * rh)
                - 4.81975E-11D * (double) (t * t * t * rh * rh * rh));
        return index;
    }

    public void display() {
        System.out.println("Heat index is " + this.heatIndex);
    }

}

