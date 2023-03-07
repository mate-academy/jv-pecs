package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfTrailers;

    public Truck() {

    }

    public Truck(String name, String color, String model, int year, int numberOfTrailers) {
        super(name, color, model, year);
        this.numberOfTrailers = numberOfTrailers;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }
}
