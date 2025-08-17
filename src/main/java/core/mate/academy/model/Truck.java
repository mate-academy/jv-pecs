package core.mate.academy.model;

public class Truck extends Machine {
    private int cargoCapacity;
    private int numberOfAxles;

    public Truck(int cargoCapacity, int numberOfAxles) {
        this.cargoCapacity = cargoCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
