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

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
