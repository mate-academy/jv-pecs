package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerCapacity;

    public Truck() {
    }

    public Truck(int trailerCapacity) {
        this.trailerCapacity = trailerCapacity;
    }

    public int getTrailerCapacity() {
        return trailerCapacity;
    }

    public void setTrailerCapacity(int trailerCapacity) {
        this.trailerCapacity = trailerCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck with trailer capacity "
                + trailerCapacity + " started to work");
    }
}
