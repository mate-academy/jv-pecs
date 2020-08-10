package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int loadedWeight;
    private int maximumPermissibleWeight;

    public Track() {
    }

    public Track(int loadedWeight, int maximumPermissibleWeight) {
        this.loadedWeight = loadedWeight;
        this.maximumPermissibleWeight = maximumPermissibleWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    public int getLoadedWeight() {
        return loadedWeight;
    }

    public void setLoadedWeight(int loadedWeight) {
        this.loadedWeight = loadedWeight;
    }

    public int getMaximumPermissibleWeight() {
        return maximumPermissibleWeight;
    }

    public void setMaximumPermissibleWeight(int maximumPermissibleWeight) {
        this.maximumPermissibleWeight = maximumPermissibleWeight;
    }
}
