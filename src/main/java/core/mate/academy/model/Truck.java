package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyType;
    private int liftingCapacity;

    public Truck() {
    }

    public Truck(String name, String color, String bodyType, int liftingCapacity) {
        super(name, color);
        this.bodyType = bodyType;
        this.liftingCapacity = liftingCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
