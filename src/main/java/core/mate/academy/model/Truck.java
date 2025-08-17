package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int liftingCapacity;
    private double bodyHeight;

    public Truck() {
    }

    public Truck(int liftingCapacity, double bodyHeight) {
        this.liftingCapacity = liftingCapacity;
        this.bodyHeight = bodyHeight;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public double getBodyHeight() {
        return bodyHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
