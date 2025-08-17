package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearOfProduction;
    private int engineCapacity;
    private int numberOfAxles;

    public Truck(int yearOfProduction, int engineCapacity, int numberOfAxles) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public Truck setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public Truck setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Truck setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
        return this;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
