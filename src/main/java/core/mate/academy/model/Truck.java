package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int cargo;

    public Truck() {
    }

    public Truck(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
