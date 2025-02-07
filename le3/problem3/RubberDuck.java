class RubberDuck implements SwimBehavior, SqueakBehavior {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming!");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}