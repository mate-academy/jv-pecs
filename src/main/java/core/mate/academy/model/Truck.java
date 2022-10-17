package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int tonnage;

    public Truck() {
    }

    public Truck(int tonnage) {
        super();
        this.tonnage = tonnage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
