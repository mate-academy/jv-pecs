package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private int maxSpeed;
    private int enginePower;

    public Truck() {
    }

    public Truck(int loadCapacity, int maxSpeed, int enginePower) {
        this.loadCapacity = loadCapacity;
        this.maxSpeed = maxSpeed;
        this.enginePower = enginePower;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
