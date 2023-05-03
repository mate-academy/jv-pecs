package core.mate.academy.model;

public class Truck extends Machine {
    private double carryingCapacity;
    private int tireSize;

    public Truck(String name, String color, double carryingCapacity, int tireSize) {
        super(name, color);
        this.carryingCapacity = carryingCapacity;
        this.tireSize = tireSize;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
