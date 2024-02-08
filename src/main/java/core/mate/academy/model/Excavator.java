package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;
    private int swingRadius;

    public Excavator() {
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public int getSwingRadius() {
        return swingRadius;
    }

    public void setSwingRadius(int swingRadius) {
        this.swingRadius = swingRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
