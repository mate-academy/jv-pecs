package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String bucketType;
    private int bucketSize;

    public Excavator(String bucketType, int bucketSize) {
        this.bucketType = bucketType;
        this.bucketSize = bucketSize;
    }

    public Excavator() {
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
