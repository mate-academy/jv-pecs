package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String chassisType;
    private String principeOfOperation;
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, String chassisType, String principeOfOperation, int bucketCapacity) {
        super(name, color);
        this.chassisType = chassisType;
        this.principeOfOperation = principeOfOperation;
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public String getPrincipeOfOperation() {
        return principeOfOperation;
    }

    public void setPrincipeOfOperation(String principeOfOperation) {
        this.principeOfOperation = principeOfOperation;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }
}
