package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private static int wheelNumber;

    public Truck() {

    }

    public Truck(String color, String name, int wheelNumber) {
        super(name, color);
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
