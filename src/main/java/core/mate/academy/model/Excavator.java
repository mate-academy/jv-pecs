package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketSize;
    private int buketPower;

    public Excavator() {
    }

    public double getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(double bucketSize) {
        this.bucketSize = bucketSize;
    }

    public int getBuketPower() {
        return buketPower;
    }

    public void setBuketPower(int buketPower) {
        this.buketPower = buketPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
