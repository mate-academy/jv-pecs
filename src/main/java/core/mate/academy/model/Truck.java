package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int timeSinceLastRepair;
    private String customer;

    public Truck(String name, String color, int timeSinceLastRepair, String customer) {
        super(name, color);
        this.timeSinceLastRepair = timeSinceLastRepair;
        this.customer = customer;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
