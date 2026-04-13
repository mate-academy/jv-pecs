package core.mate.academy.model;

public class Truck extends Machine {
    private double cargoCapacity;
    private boolean trailerAttached;

    public Truck() {
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public boolean isTrailerAttached() {
        return trailerAttached;
    }

    public void setTrailerAttached(boolean trailerAttached) {
        this.trailerAttached = trailerAttached;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
