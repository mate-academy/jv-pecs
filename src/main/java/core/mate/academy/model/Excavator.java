package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int armLength;
    private String excavatorType;

    public Excavator() {

    }

    public Excavator(int bucketCapacity, int armLength, String excavatorType) {
        setBucketCapacity(bucketCapacity);
        setArmLength(armLength);
        setExcavatorType(excavatorType);
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    public void setExcavatorType(String excavatorType) {
        this.excavatorType = excavatorType;
    }
}
