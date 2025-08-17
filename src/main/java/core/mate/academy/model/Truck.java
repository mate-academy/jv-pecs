package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearOfConstruct;
    private int numberOfWheels;

    public Truck(int yearOfConstruct, int numberOfWheels) {
        this.yearOfConstruct = yearOfConstruct;
        this.numberOfWheels = numberOfWheels;
    }

    public Truck() {
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getYearOfConstruct() {
        return yearOfConstruct;
    }

    public void setYearOfConstruct(int yearOfConstruct) {
        this.yearOfConstruct = yearOfConstruct;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
