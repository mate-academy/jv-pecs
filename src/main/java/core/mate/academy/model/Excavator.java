package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketSize;
    private boolean amphibious;

    public Excavator() {
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public boolean isAmphibious() {
        return amphibious;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public void setAmphibious(boolean amphibious) {
        this.amphibious = amphibious;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
