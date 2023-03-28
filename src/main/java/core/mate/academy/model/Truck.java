package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements Workable {
    private int loadCapacity;
    private String bodyType;

    public Truck(int loadCapacity, String bodyType) {
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
