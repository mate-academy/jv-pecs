package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int whels;
    private int height;

    public Truck() {
    }

    public Truck(int whels, int height) {
        this.whels = whels;
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
