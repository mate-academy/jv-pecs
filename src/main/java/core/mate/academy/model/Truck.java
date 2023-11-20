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

    public Truck(String name, String color, int hoursePower, boolean isCapableToDrive) {
        super.setName(name);
        super.setColor(color);
        this.hoursePower = hoursePower;
        this.isCapableToDrive = isCapableToDrive;
    }

    public int getHoursePower() {
        return hoursePower;
    }

    public boolean isCapableToDrive() {
        return isCapableToDrive;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
