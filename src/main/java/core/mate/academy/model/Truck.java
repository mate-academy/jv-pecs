package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int whiles;

    public Truck() {
    }

    public int getWhiles() {
        return whiles;
    }

    public void setWhiles(int whiles) {
        this.whiles = whiles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
