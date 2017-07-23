/**
 * Created by patrick on 7/22/2017.
 */
public class RubberDuck extends Duck {
    public void quack(){
        System.out.println("quack quack.");
    }
    @Override
    public void display() {
        System.out.println("I look like a duck made of rubber.");
    }
}
