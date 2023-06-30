package core.mate.academy.model;

public class Excavator extends Machine {
    private String brand;
    private int engineVolume;
    private String fuelType;

    public Excavator() {
    }

    public Excavator(String brand, int engineVolume, String fuelType) {
        this.brand = brand;
        this.engineVolume = engineVolume;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String company) {
        this.brand = brand;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
