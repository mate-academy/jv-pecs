package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyType;
    private int loadCapacity;

    public Truck() {
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
