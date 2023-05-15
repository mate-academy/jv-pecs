package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxSpeed;
    private int fuelVolume;

    public Truck(int maxSpeed, int fuelVolume) {
        this.maxSpeed = maxSpeed;
        this.fuelVolume = fuelVolume;
    }

    public Truck() {
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(int fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
