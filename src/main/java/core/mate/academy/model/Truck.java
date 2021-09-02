package core.mate.academy.model;

public class Truck extends Machine {
    private double maxLoad;
    private int maxSpeed;

    public Truck(double maxLoad, int maxSpeed, String name, String color) {
        super(name, color);
        this.maxLoad = maxLoad;
        this.maxSpeed = maxSpeed;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
