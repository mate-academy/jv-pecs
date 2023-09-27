package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public static final int MIN_CARGO_CAPACITY = 1;
    public static final int MAX_CARGO_CAPACITY = 20;
    private int cargoCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int power, int cargoCapacity) {
        super(name, color, power);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
