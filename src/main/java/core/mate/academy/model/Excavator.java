package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketCapacity;
    private double boomLength;
    private String bucketType;

    public Excavator(double bucketCapacity, double boomLength, String bucketType) {
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
        this.bucketType = bucketType;
    }

    public Excavator() {

    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(double boomLength) {
        this.boomLength = boomLength;
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }
}
