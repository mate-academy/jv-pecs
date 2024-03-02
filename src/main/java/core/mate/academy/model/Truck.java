package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String cargoType;
    private double cargoCapacity;
    private int numberOfAxles;

    public Truck() {
    }

    public Truck(String cargoType, double cargoCapacity, int numberOfAxles) {
        this.cargoType = cargoType;
        this.cargoCapacity = cargoCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
