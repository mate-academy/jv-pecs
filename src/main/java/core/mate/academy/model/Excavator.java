package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private int boomLength;

    public Excavator() {
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
