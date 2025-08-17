package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int intTruck;
    private String stringTruck;

    public Truck(String name, String color, int intTruck, String stringTruck) {
        super(name, color);
        this.intTruck = intTruck;
        this.stringTruck = stringTruck;
    }
    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
