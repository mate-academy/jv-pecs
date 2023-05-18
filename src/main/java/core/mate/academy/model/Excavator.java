package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxBucketVolume;
    private int maxHeightBucket;

    public Excavator(int maxBucketVolume, int maxHeightBucket) {
        this.maxBucketVolume = maxBucketVolume;
        this.maxHeightBucket = maxHeightBucket;
    }

    public Excavator() {
    }

    public int getMaxBucketVolume() {
        return maxBucketVolume;
    }

    public void setMaxBucketVolume(int maxBucketVolume) {
        this.maxBucketVolume = maxBucketVolume;
    }

    public int getMaxHeightBucket() {
        return maxHeightBucket;
    }

    public void setMaxHeightBucket(int maxHeightBucket) {
        this.maxHeightBucket = maxHeightBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
