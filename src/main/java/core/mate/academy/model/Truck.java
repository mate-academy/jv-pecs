package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int speed;

    public Truck() {
        speed = 60;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work with maximum speed of " + speed + " km/h");
    }
}
