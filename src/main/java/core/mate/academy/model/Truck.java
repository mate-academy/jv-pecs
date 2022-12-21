package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int cargoMass;
    private double fuelConsumption;

    public Truck(int maxSpeed, int cargoMass, double fuelConsumption) {
        this.maxSpeed = maxSpeed;
        this.cargoMass = cargoMass;
        this.fuelConsumption = fuelConsumption;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
