package core.mate.academy.model;

public class Truck extends Machine {
    private String brand;
    private int engineVolume;
    private String fuelType;

    public Truck() {
    }

    public Truck(String brand, int engineVolume, String fuelType) {
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getEngineVolume() {
        return engineVolume;
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
