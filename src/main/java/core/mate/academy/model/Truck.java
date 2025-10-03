package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private int numberOfLoads;
    private String fuelType;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity, int numberOfLoads, String fuelType) {
        setName(name);
        setColor(color);
        this.loadCapacity = loadCapacity;
        this.numberOfLoads = numberOfLoads;
        this.fuelType = fuelType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getNumberOfLoads() {
        return numberOfLoads;
    }

    public void setNumberOfLoads(int numberOfLoads) {
        this.numberOfLoads = numberOfLoads;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
