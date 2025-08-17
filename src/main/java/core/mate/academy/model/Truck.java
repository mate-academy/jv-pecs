package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private int engineTorque;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity, int engineTorque) {
        setName(name);
        setColor(color);
        this.loadCapacity = loadCapacity;
        this.engineTorque = engineTorque;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getEngineTorque() {
        return engineTorque;
    }

    public void setEngineTorque(int engineTorque) {
        this.engineTorque = engineTorque;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
