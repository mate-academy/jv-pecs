package core.mate.academy.model;

public class Truck extends Machine {
    private int tractionForce;

    public Truck() {
    }

    public Truck(String name, String color, int tractionForce) {
        super(name, color);
        this.tractionForce = tractionForce;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
