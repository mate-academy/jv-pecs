package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double fuelConsumption;

    public Truck() {
    }

    public Truck(String name, String color, double fuelConsumption) {
        super(name, color);
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
