package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int speed;

    public Truck() {
    }

    public Truck(String name, String color) {
        setName(name);
        setColor(color);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
