class RedHeadDuck implements SwimBehavior, FlyBehavior, QuackBehavior {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming!");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }
}