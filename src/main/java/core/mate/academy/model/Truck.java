package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private float loadCapacity;
    private int wheelsCount;

    public Truck() {
    }

    public Truck(float loadCapacity, int wheelsCount) {
        this.loadCapacity = loadCapacity;
        this.wheelsCount = wheelsCount;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
