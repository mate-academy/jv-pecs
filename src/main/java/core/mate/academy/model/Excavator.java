package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private float bucketCapacity;
    private int maxDiggingDepth;

    public Excavator() {
    }

    public float getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(float bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
