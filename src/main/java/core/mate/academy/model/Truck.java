package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int maxPermissibleWeight;
    private int maxPermissibleVolume;

    public Truck() {
    }

    public Truck(int maxPermissibleWeight, int maxPermissibleVolume) {
        this.maxPermissibleWeight = maxPermissibleWeight;
        this.maxPermissibleVolume = maxPermissibleVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxPermissibleWeight() {
        return maxPermissibleWeight;
    }

    public void setMaxPermissibleWeight(int maxPermissibleWeight) {
        this.maxPermissibleWeight = maxPermissibleWeight;
    }

    public int getMaxPermissibleVolume() {
        return maxPermissibleVolume;
    }

    public void setMaxPermissibleVolume(int maxPermissibleVolume) {
        this.maxPermissibleVolume = maxPermissibleVolume;
    }

}
