package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int numberOfTrailer;
    private int maxCapacity;

    public Truck() {
    }

    public int getNumberOfTrailer() {
        return numberOfTrailer;
    }

    public void setNumberOfTrailer(int numberOfTrailer) {
        this.numberOfTrailer = numberOfTrailer;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
