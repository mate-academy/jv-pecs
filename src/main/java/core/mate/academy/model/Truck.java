package core.mate.academy.model;

public class Truck extends Machine {
    private double loadCapacity;
    private String cargoType;
    private double cargoVolume;

    public Truck() {
    }

    public Truck(double loadCapacity, String cargoType, double cargoVolume) {
        this.loadCapacity = loadCapacity;
        this.cargoType = cargoType;
        this.cargoVolume = cargoVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }
}
