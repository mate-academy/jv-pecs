package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int liftingCapacity;
    private int bodyLength;
    private String nameCapacity;

    public Truck(int liftingCapacity, int bodyLength, String nameCapacity) {
        this.liftingCapacity = liftingCapacity;
        this.bodyLength = bodyLength;
        this.nameCapacity = nameCapacity;
    }

    public Truck() {
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public String getNameCapacity() {
        return nameCapacity;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
