package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int serialNumber;
    private int length;

    public Truck() {
    }

    public int getLength() {
        return length;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
