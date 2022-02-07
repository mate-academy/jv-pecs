package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int boomLength;

    public Excavator() {
    }

    private Excavator(int bucketCapacity, int boomLength) {
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
    }

    public static Excavator of(int bucketCapacity, int boomLength) {
        return new Excavator(bucketCapacity,boomLength);
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(int boomLength) {
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
