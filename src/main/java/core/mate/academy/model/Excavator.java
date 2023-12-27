package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int bucketRange;
    private int bucketVolume;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucketRange() {
        return bucketRange;
    }

    public Excavator setBucketRange(int bucketRange) {
        this.bucketRange = bucketRange;
        return this;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public Excavator setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
        return this;
    }
}
