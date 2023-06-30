package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String brand;
    private String fuelType;
    private int engineVolume;

    public Bulldozer() {
    }

    public Bulldozer(String brand, String fuelType, int engineVolume) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
