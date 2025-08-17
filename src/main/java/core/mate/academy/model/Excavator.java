package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketType;
    private double lengthOfArrow;

    public Excavator() {
    }

    public Excavator(String bucketType, double lengthOfArrow) {
        this.bucketType = bucketType;
        this.lengthOfArrow = lengthOfArrow;
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    public double getLengthOfArrow() {
        return lengthOfArrow;
    }

    public void setLengthOfArrow(double lengthOfArrow) {
        this.lengthOfArrow = lengthOfArrow;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
