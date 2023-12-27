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

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getMaxPermissibleWeight() {
        return maxPermissibleWeight;
    }

    public Truck setMaxPermissibleWeight(int maxPermissibleWeight) {
        this.maxPermissibleWeight = maxPermissibleWeight;
        return this;
    }

    public int getMaxPermissibleVolume() {
        return maxPermissibleVolume;
    }

    public Truck setMaxPermissibleVolume(int maxPermissibleVolume) {
        this.maxPermissibleVolume = maxPermissibleVolume;
        return this;
    }

}
