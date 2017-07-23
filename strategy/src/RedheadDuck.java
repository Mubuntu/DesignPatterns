/**
 * Created by patrick on 7/22/2017.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck");
    }
}
