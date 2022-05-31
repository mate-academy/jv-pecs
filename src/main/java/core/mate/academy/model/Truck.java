package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int ipn;
    private String mame;
    public Truck() {
    }

    public Truck(int ipn, String mame) {
        this.ipn = ipn;
        this.mame = mame;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
