/**
 * Created by patrick on 7/22/2017.
 * <p>
 * definitie strategy pattern:
 * defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        //behavior werd at runtime dynamisch veranderd (gaat niet als implementatie binnen Duck leeft)
    }
}
