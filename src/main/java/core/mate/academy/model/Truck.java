package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int platformCapacity;
    private int carrying;

    public Truck() {
    }

    public int getPlatformCapacity() {
        return platformCapacity;
    }

    public void setPlatformCapacity(int platformCapacity) {
        this.platformCapacity = platformCapacity;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
