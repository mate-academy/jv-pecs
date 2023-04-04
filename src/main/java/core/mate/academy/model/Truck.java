package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean commercialOnly;
    private int passengerSeats;

    public Truck() {
    }

    public Truck(boolean commercialOnly, int passengerSeats) {
        this.commercialOnly = commercialOnly;
        this.passengerSeats = passengerSeats;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
