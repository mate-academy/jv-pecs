package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {
    protected int wheelbase;
    protected int tireSize;
    protected int loadingHeight;

    public Truck() {
    }

    public Truck(int wheelbase, int tireSize, int loadingHeight) {
        this.wheelbase = wheelbase;
        this.tireSize = tireSize;
        this.loadingHeight = loadingHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
