package core.mate.academy.model;

public class Truck extends Machine {
    private boolean elevatorMechanism;
    private int carryingCapacity;

    public Truck() {
    }

    public Truck(String model, String color) {
        super(model, color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
