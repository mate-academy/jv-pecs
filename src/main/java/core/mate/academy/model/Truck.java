package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int bodyVolume;
    private int loadCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int bodyVolume, int loadCapacity) {
        setName(name);
        setColor(color);
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
    }

    public int getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(int bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
