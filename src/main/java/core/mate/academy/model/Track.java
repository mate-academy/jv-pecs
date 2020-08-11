package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int maximumPossibleWeight;
    private int currentWeight;

    public Track() {
    }

    public Track(int maximumPossibleWeight, int currentWeight) {
        this.maximumPossibleWeight = maximumPossibleWeight;
        this.currentWeight = currentWeight;
    }

    public int getMaximumPossibleWeight() {
        return maximumPossibleWeight;
    }

    public void setMaximumPossibleWeight(int maximumPossibleWeight) {
        this.maximumPossibleWeight = maximumPossibleWeight;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
