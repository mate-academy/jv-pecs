package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;

    public Truck() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public Truck clone() throws CloneNotSupportedException {
        return (Truck) super.clone();
    }
}
