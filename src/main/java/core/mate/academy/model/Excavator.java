package core.mate.academy.model;

public class Excavator extends Machine {
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
