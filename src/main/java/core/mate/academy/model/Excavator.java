package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int armLength;
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(int armLength, int bucketCapacity) {
        this.armLength = armLength;
        this.bucketCapacity = bucketCapacity;
    }

    private int getArmLength() {
        return armLength;
    }

    private void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    private int getBucketCapacity() {
        return bucketCapacity;
    }

    private void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
