package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int stickLength;
    private int bucketWidth;
    private int swingTorque;

    public Excavator() {
    }

    public Excavator(int stickLength, int bucketWidth, int swingTorque) {
        this.stickLength = stickLength;
        this.bucketWidth = bucketWidth;
        this.swingTorque = swingTorque;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    /**
     * stickLength;
     * bucketWidth;
     * swingTorque;
     */

    public int getStickLength() {
        return this.stickLength;
    }

    public int getBucketWidth() {
        return this.bucketWidth;
    }

    public int getSwingTorque() {
        return this.swingTorque;
    }

    public void setStickLength(int stickLength) {
        this.stickLength = stickLength;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    public void setSwingTorque(int swingTorque) {
        this.swingTorque = swingTorque;
    }
}
