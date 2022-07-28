class Cat extends Animal implements LivingThing {
    public void checkup() {
        System.out.println("Cat checkup");
    }

    // LivingThing interface
    @Override
    public void walk() {
        // TODO Auto-generated method stub

    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub

    }

    // Animal abstract
    @Override
    public void breath() {
        // TODO Auto-generated method stub

    }
}