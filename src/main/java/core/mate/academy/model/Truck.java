package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int wheelNumber;

    public Truck() {
        super("default", "default");
    }

    public Truck(String name, String color, int wheelNumber) {
        super(name, color);
        this.wheelNumber = wheelNumber;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
