package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoadCapacity;
    private String bodyType;

    public Truck() {
    }

    public Truck(String name, String color, String bodyType, int maxLoadCapacity) {
        super(name, color);
        this.bodyType = bodyType;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxLoadCapacity() {
        return maxLoadCapacity;
    }

    public void setMaxLoadCapacity(int maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
