package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double weightToPull;
    private boolean livingSector;

    public Truck() {
    }

    public double getWeightToPull() {
        return weightToPull;
    }

    public void setWeightToPull(double weightToPull) {
        this.weightToPull = weightToPull;
    }

    public boolean isLivingSector() {
        return livingSector;
    }

    public void setLivingSector(boolean livingSector) {
        this.livingSector = livingSector;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
