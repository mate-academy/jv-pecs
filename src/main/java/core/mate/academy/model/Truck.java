package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    public static final int DEFAULT_SPEED = 60;

    private int speed = DEFAULT_SPEED;

    public Truck() {
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work with maximum speed of " + speed + " km/h");
    }
}
