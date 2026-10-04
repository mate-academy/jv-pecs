package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double cargoCapacity;
    private int numberOfAcles;

    public Truck() {
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfAcles() {
        return numberOfAcles;
    }

    public void setNumberOfAcles(int numberOfAcles) {
        this.numberOfAcles = numberOfAcles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
