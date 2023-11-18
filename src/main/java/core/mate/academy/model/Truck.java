package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int hoursePower;
    private boolean isCapableToDrive;

    public Truck() {

    }

    public int getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    public boolean isCapableToDrive() {
        return isCapableToDrive;
    }

    public void setCapableToDrive(boolean capableToDrive) {
        isCapableToDrive = capableToDrive;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
