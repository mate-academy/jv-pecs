package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;
    private double bucketWidth;

    public Excavator() {
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public double getBucketWidth() {
        return bucketWidth;
    }

    public void setBucketWidth(double bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
