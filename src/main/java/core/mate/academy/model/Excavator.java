package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorType;
    private double bucketCapacity;
    private double boomLength;

    public Excavator() {
    }

    public Excavator(String excavatorType,
                     double bucketCapacity, double boomLength) {
        this.excavatorType = excavatorType;
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(double boomLength) {
        this.boomLength = boomLength;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getExcavatorType() {
        return excavatorType;
    }

    public void setExcavatorType(String excavatorType) {
        this.excavatorType = excavatorType;
    }
}
