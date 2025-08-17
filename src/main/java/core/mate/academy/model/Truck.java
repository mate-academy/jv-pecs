package core.mate.academy.model;

public class Truck extends Machine {
    private double cargoCapacity;
    private double trailerLength;
    private double enginePower;

    public Truck() {
    }

    public Truck(double cargoCapacity, double trailerLength, double enginePower) {
        this.cargoCapacity = cargoCapacity;
        this.trailerLength = trailerLength;
        this.enginePower = enginePower;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public double getTrailerLength() {
        return trailerLength;
    }

    public double getEnginePower() {
        return enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
