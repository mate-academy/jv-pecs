package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int tankValue;

    public Truck() {
    }

    public Truck(int tankValue) {
        this.tankValue = tankValue;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getTankValue() {
        return tankValue;
    }
}
