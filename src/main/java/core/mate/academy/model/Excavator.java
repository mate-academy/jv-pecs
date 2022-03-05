package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int length;
    private int bucketVolume;

    public Excavator() {
    }

    private Excavator(int length, int bucketVolume) {
        this.length = length;
        this.bucketVolume = bucketVolume;
    }

    public static Excavator of(int length, int bucketVolume) {
        return new Excavator(length, bucketVolume);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
