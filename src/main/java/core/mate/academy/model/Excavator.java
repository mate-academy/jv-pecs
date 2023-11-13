package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean isLadle;
    private String bucketType;

    public Excavator() {
    }

    public void setIsLadle(boolean isLadle) {
        this.isLadle = isLadle;
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
