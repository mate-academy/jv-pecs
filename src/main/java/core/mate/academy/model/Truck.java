package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int wheelsNum;

    public Truck() {
    }

    public Truck(int wheelsNum) {
        this.wheelsNum = wheelsNum;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
