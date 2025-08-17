package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketSize;

    public Excavator() {
    }

    public int getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(int bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
