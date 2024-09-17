package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckField;

    public Truck() {
    }

    public int getTruckField() {
        return truckField;
    }

    public void setTruckField(int truckField) {
        this.truckField = truckField;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
