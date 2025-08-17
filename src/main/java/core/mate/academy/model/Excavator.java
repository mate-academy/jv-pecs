package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int stickLength;
    private int bucketVolume;

    public Excavator() {
    }

    public Excavator(int stickLength, int bucketVolume) {
        this.bucketVolume = bucketVolume;
        this.stickLength = stickLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getStickLength() {
        return stickLength;
    }

    public void setStickLength(int stickLength) {
        this.stickLength = stickLength;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(int bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "stickLength="
                + stickLength
                + ", bucketVolume="
                + bucketVolume
                + '}';
    }
}
