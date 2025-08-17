package core.mate.academy.model;

public class Truck extends Machine {
    private int cargoCapacity;
    private int maxSpeed;

    public Truck() {
    }

    public Truck(int cargoCapacity, int maxSpeed) {
        this.cargoCapacity = cargoCapacity;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
