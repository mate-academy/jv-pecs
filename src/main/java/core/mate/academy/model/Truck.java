package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxKg;

    public Truck() {
    }

    public Truck(int maxKg) {
        this.maxKg = maxKg;
    }

    public int getMaxKg() {
        return maxKg;
    }

    public void setMaxKg(int maxKg) {
        this.maxKg = maxKg;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
