package weather;

/**
 * Created by patrick on 7/23/2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
