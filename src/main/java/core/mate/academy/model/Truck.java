package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int trailerLength;
    private int numberOfWheels;

    public Truck(int trailerLength, int numberOfWheels) {
        this.trailerLength = trailerLength;
        this.numberOfWheels = numberOfWheels;
    }

    public Truck() {
    }

    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
