package weather;

/**
 * Created by patrick on 7/23/2017.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200.0f;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + this.tempSum / (float) this.numReadings + "/" + this.maxTemp + "/" + this.minTemp);
        System.out.println("=========================================");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
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
