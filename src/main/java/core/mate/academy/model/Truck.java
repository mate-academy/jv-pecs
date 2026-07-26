package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private String fuelType;

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
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
