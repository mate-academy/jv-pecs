package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargoCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int cargoCapacity) {
        super(name, color);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
