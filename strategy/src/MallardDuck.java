/**
 * Created by patrick on 7/22/2017.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        //instance variabelen hieronder worden mee overgeerfd dankzij Duck
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        //verantwoordelijkheid voor flyingbehavior wordt gedelegeerd naar FlyWithWings


    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }
}
