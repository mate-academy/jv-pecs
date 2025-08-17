package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private int wheels;

    public Truck() {
    }

    public Truck(int loadCapacity, int wheels) {
        this.loadCapacity = loadCapacity;
        this.wheels = wheels;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
