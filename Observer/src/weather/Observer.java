package weather;

/**
 * Created by patrick on 7/23/2017.
 */
public interface Observer {
    //state values the observer gets from weather measurement changes
    public void update(float temp, float humidity, float pressure);

}
