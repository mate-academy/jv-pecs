package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements Workable {
    private int bucketHeight;
    private int rotatingSpeed;

    public Excavator(int bucketHeight, int rotatingSpeed) {
        this.bucketHeight = bucketHeight;
        this.rotatingSpeed = rotatingSpeed;
    }

    public Excavator() {
    }

    public int getBucketHeight() {
        return bucketHeight;
    }

    public void setBucketHeight(int bucketHeight) {
        this.bucketHeight = bucketHeight;
    }

    public int getRotatingSpeed() {
        return rotatingSpeed;
    }

    public void setRotatingSpeed(int rotatingSpeed) {
        this.rotatingSpeed = rotatingSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
