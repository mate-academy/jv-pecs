package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketPower;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucketPower() {
        return bucketPower;
    }

    public void setBucketPower(int bucketPower) {
        this.bucketPower = bucketPower;
    }
}
