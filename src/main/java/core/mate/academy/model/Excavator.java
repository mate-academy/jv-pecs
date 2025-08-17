package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketHeight;
    private int liftingCapacity;

    public Excavator() {
    }

    public int getBucketHeight() {
        return bucketHeight;
    }

    public void setBucketHeight(int bucketHeight) {
        this.bucketHeight = bucketHeight;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
