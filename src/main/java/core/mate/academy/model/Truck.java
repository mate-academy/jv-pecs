package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfWheels;
    private int maxSpeed;

    public Truck() {
    }

    public Truck(String name, String color, int numberOfWheels, int maxSpeed) {
        super.setName(name);
        super.setColor(color);
        this.numberOfWheels = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
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
}
