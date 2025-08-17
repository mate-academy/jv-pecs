package core.mate.academy.model;

public class Truck extends Machine {
    private int bodyCapacity;
    private int fuelCapacity;

    public Truck(int bodyCapacity, int fuelCapacity) {
        this.bodyCapacity = bodyCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
