package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String chassisType;
    private int bucketCapacity;
    private int bodyRotationRadius;

    public Excavator() {
    }

    public Excavator(String chassisType, int bucketCapacity, int bodyRotationRadius) {
        this.chassisType = chassisType;
        this.bucketCapacity = bucketCapacity;
        this.bodyRotationRadius = bodyRotationRadius;
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getBodyRotationRadius() {
        return bodyRotationRadius;
    }

    public void setBodyRotationRadius(int bodyRotationRadius) {
        this.bodyRotationRadius = bodyRotationRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
