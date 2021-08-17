package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfRidges;

    public Truck() {
    }

    public Truck(String name, String color, int numberOfRidges) {
        super(name, color);
        this.numberOfRidges = numberOfRidges;
    }

    public int getNumberOfRidges() {
        return numberOfRidges;
    }

    public void setNumberOfRidges(int numberOfRidges) {
        this.numberOfRidges = numberOfRidges;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String toString() {
        return "Truck{"
                + "numberOfRidges = " + numberOfRidges
                + '}';
    }
}
