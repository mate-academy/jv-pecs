package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double totalWeight;

    public Truck() {
    }

    public Truck(String name, String color, double totalWeight) {
        super(name, color);
        this.totalWeight = totalWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
