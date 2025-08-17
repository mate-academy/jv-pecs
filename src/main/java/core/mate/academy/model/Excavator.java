package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketSize;

    public Excavator() {
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public int getBucketSize() {
        return bucketSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
