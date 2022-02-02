package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int speed;
    private int yearOfRegestrationDriver;

    public Truck() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYearOfRegestrationDriver() {
        return yearOfRegestrationDriver;
    }

    public void setYearOfRegestrationDriver(int yearOfRegestrationDriver) {
        this.yearOfRegestrationDriver = yearOfRegestrationDriver;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
