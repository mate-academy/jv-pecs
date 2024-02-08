package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private boolean trailerAttachment;
    private int numberOfAxles;

    public Truck() {
    }

    public boolean isTrailerAttachment() {
        return trailerAttachment;
    }

    public void setTrailerAttachment(boolean trailerAttachment) {
        this.trailerAttachment = trailerAttachment;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
