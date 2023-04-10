package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int numberOfTrucks;

    public Truck(int maxSpeed, int numberOfTrucks) {
        this.maxSpeed = maxSpeed;
        this.numberOfTrucks = numberOfTrucks;
    }

    public Truck() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfTrucks() {
        return numberOfTrucks;
    }

    public void setCounterOfTrucks(int numberOfTrucks) {
        this.numberOfTrucks = numberOfTrucks;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
