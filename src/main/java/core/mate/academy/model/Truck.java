package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    int speed;

    public Truck() {

    }

    public Truck(String name, String color, int speed) {
        super(name, color);
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
