package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketType;
    private double bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, String bucketType, double bucketVolume) {
        super(name, color);
        this.bucketType = bucketType;
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
}
