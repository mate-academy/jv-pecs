package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckBody;

    public Truck() {
    }

    public Truck(int truckBody) {
        this.truckBody = truckBody;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTruckBody() {
        return truckBody;
    }

    public void setTruckBody(int truckBody) {
        this.truckBody = truckBody;
    }
}
