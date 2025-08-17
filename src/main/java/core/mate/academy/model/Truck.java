package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double loadCapacity;
    private double driveAxleRatio;

    public Truck() {
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getDriveAxleRatio() {
        return driveAxleRatio;
    }

    public void setDriveAxleRatio(double driveAxleRatio) {
        this.driveAxleRatio = driveAxleRatio;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
