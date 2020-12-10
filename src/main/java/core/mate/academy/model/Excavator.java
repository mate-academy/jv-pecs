package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private int maxSpeed;
    private String undercarriageType;

    public Excavator() {
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getUndercarriageType() {
        return undercarriageType;
    }

    public void setUndercarriageType(String undercarriageType) {
        this.undercarriageType = undercarriageType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
