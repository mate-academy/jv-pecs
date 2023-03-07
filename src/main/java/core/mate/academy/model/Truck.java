package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int truckBody;

    public Truck() {
    }

    public Truck(String name, String color, int truckBody) {
        super(name, color);
        this.truckBody = truckBody;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
