package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargoCapacity;
    private int numberOfAxles;

    public Truck(int cargoCapacity, int numberOfAxles) {
        this.cargoCapacity = cargoCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public Truck setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        return this;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Truck setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
