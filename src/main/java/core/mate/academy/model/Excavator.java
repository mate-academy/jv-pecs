package core.mate.academy.model;

public class Excavator extends Machine {

    private double bucketCapacity;
    private int armLength;

    public Excavator() {
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
