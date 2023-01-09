package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity;
    private int armLength;

    public Excavator() {
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public int getArmLength() {
        return armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
