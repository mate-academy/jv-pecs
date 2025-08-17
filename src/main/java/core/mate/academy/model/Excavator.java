package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private float maxDiggingDepth;
    private String bucketType;

    public Excavator() {

    }

    public Excavator(float maxDiggingDepth, String bucketType) {
        this.bucketType = bucketType;
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public float getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(float maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
