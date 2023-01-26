package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private String bucketSize;
    private int rangeOfBucket;

    public Excavator() {
    }

    public String getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(String bucketSize) {
        this.bucketSize = bucketSize;
    }

    public int getRangeOfBucket() {
        return rangeOfBucket;
    }

    public void setRangeOfBucket(int rangeOfBucket) {
        this.rangeOfBucket = rangeOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
