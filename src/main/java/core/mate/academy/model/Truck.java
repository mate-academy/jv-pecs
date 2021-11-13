package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine {

    private double grossWeight;
    private double volumeCapacity;

    public Truck() {
    }

    public double getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(double grossWeight) {
        this.grossWeight = grossWeight;
    }

    public double getVolumeCapacity() {
        return volumeCapacity;
    }

    public void setVolumeCapacity(double volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
