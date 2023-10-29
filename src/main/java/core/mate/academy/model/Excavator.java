package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public Excavator setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
        return this;
    }
}
