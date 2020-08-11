package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int remainingCapacity;
    private int trailerHeight;

    public Truck() {
    }

    public Truck(int remainingCapacity, int trailerHeight) {
        this.remainingCapacity = remainingCapacity;
        this.trailerHeight = trailerHeight;
    }

    public void setRemainingCapacity(int remainingCapacity) {
        this.remainingCapacity = remainingCapacity;
    }

    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    public void setTrailerHeight(int trailerHeight) {
        this.trailerHeight = trailerHeight;
    }

    public int getTrailerHeight() {
        return trailerHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
