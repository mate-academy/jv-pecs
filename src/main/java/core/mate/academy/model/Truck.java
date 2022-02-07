package core.mate.academy.model;

public class Truck extends Machine {
    private int speed;
    private int yearOfRegestrationDriver;

    public Truck() {
    }

    public Truck(int speed, int yearOfRegestrationDriver) {
        this.speed = speed;
        this.yearOfRegestrationDriver = yearOfRegestrationDriver;
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
