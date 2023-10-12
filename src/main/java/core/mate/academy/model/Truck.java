package core.mate.academy.model;

public class Truck extends Machine {
    private double cargoCapacity;

    public Truck() {
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
