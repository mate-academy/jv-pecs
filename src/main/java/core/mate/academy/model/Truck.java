package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private String licensePlate;
    private double fuelLevel;

    public Truck() {
    }

    public Truck(int loadCapacity, String licensePlate, double fuelLevel) {
        this.loadCapacity = loadCapacity;
        this.licensePlate = licensePlate;
        this.fuelLevel = fuelLevel;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
