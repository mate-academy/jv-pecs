package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double maxWeight;
    private double fuelConsumption;
    private double brand;

    public Truck() {
    }

    public Truck(double maxWeight, double brand, double fuelConsumption) {
        this.maxWeight = maxWeight;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
