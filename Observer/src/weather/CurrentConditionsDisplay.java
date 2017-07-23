package weather;

/**
 * Created by patrick on 7/23/2017.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        //prints out most recent temp + humidity
        System.out.println("Current Conditions: "+ temperature
                +"F degrees and "+ humidity+" % humidity");
        System.out.println("=========================================");

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
