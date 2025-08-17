package core.mate.academy.model;

public class Truck extends Machine {
    private double cargoCapacity;
    private double loadCapacity;
    private double fuelEfficiency;

    public Truck() {
    }

    public Truck(double cargoCapacity, double loadCapacity, double fuelEfficiency) {
        this.cargoCapacity = cargoCapacity;
        this.loadCapacity = loadCapacity;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
