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

    public Excavator(int bucketRange, int bucketVolume) {
        this.bucketRange = bucketRange;
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucketRange() {
        return bucketRange;
    }

    public void setBucketRange(int bucketRange) {
        this.bucketRange = bucketRange;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
}
