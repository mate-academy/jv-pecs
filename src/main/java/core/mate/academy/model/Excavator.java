package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketLength;

    public Excavator(String name, String color, int bucketLength) {
        super(name, color);
        this.bucketLength = bucketLength;
    }

    public int getBucketLength() {
        return bucketLength;
    }

    public void setBucketLength(int bucketLength) {
        this.bucketLength = bucketLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
