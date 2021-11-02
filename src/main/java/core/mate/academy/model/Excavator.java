package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketLength;

    public Excavator() {
    }

    public int getBucketLength() {
        return bucketLength;
    }

    public void setBucketLength(int bucketLength) {
        this.bucketLength = bucketLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
