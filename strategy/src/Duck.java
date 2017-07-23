/**
 * Created by patrick on 7/22/2017.
 * <p>
 * design principle:
 * Identify the aspects of your
 * application that vary and separate
 * them from what stays the sa;me.
 * <p>
 * design principle:
 * Program to an interface, not an
 * implementation.
 * <p>
 * design principle:
 * Favor composition over inheritance.
 */
public class Duck {
    //elke Duck heeft een referentie naar iets dat de FlyBehavior interface implementeert
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * wordt vervangen door interface QuackBehavior (geen concrete implementatie
     * maar wordt polymorfisch gerefrenceerd naar een specifieke behavior type at runtime.
     * methode performQuack zal deze methode vervangen.
     */
    @Deprecated
    public void quack() {
    }

    public void performQuack() {
        quackBehavior.quack();
        /**
         * duck object delegeert hier het afhandelen van de QuackBehavior naar het object dat quackBehavior hier naartoe verwijst.
         */
    }


    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void display() {
        System.out.println("I am a Duck");
    }

    /**
     * wordt vervangen door interface FlyBehavior (geen concrete implementatie
     * maar wordt polymorfisch gerefrenceerd naar een specifieke behavior type at runtime.
     * methode performFly zal deze methode vervangen.
     */
    @Deprecated
    public void fly() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performFly() {
        flyBehavior.fly();
    }
}

