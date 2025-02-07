interface FlyBehavior {
    void fly();
}

interface QuackBehavior {
    void quack();
}

interface SwimBehavior {
    void swim();
}

interface SqueakBehavior {
    void squeak();
}

interface MuteBehavior {
    void mute();
}

public class Duck {
    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();
        WoodenDuck woodenDuck = new WoodenDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        LakeDuck lakeDuck = new LakeDuck();

        System.out.println("Rubber Duck:");
        rubberDuck.swim();
        rubberDuck.squeak();

        System.out.println("\nWooden Duck:");
        woodenDuck.swim();
        woodenDuck.mute();

        System.out.println("\nRedHead Duck:");
        redHeadDuck.swim();
        redHeadDuck.fly();
        redHeadDuck.quack();

        System.out.println("\nLake Duck:");
        lakeDuck.swim();
        lakeDuck.fly();
        lakeDuck.quack();
    }
}