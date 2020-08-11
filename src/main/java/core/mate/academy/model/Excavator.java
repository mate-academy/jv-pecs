package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;
    private int bucketMaxPossibleWeight;

    public Excavator() {
    }

    public Excavator(int bucketSize, int bucketMaxPossibleWeight) {
        this.bucketSize = bucketSize;
        this.bucketMaxPossibleWeight = bucketMaxPossibleWeight;
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public int getBucketMaxPossibleWeight() {
        return bucketMaxPossibleWeight;
    }

    public void setBucketMaxPossibleWeight(int bucketMaxPossibleWeight) {
        this.bucketMaxPossibleWeight = bucketMaxPossibleWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
