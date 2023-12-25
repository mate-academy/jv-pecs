package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfWheels;
    private int trailerLength;

    public Truck() {
    }

    public Truck(int numberOfWheels, int trailerLength) {
        this.numberOfWheels = numberOfWheels;
        this.trailerLength = trailerLength;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getTrailerLength() {
        return trailerLength;
    }

    public void setTrailerLength(int trailerLength) {
        this.trailerLength = trailerLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
