package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int cargoCapacity;
    private int height;

    public Truck() {
    }

    public Truck(String name, String color, int maxSpeed, int cargoCapacity, int height) {
        super(name, color);
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
        this.height = height;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
