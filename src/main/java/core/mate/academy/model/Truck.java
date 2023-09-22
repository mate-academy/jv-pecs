package core.mate.academy.model;

public class Truck extends Machine {
    private String trailerType;
    private double cargoCapacity;
    private String fuelType;
    private double fuelConsumption;

    public Truck(String trailerType, double cargoCapacity,
                 String fuelType, double fuelConsumption) {
        this.trailerType = trailerType;
        this.cargoCapacity = cargoCapacity;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(String trailerType) {
        this.trailerType = trailerType;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
