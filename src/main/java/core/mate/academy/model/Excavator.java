package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int numberOfBuckets;
    private int bucketValue;

    public Excavator() {
    }

    public Excavator(String name, String color, int numberOfBuckets, int bucketValue) {
        setName(name);
        setColor(color);
        this.numberOfBuckets = numberOfBuckets;
        this.bucketValue = bucketValue;
    }

    public int getNumberOfBuckets() {
        return numberOfBuckets;
    }

    public void setNumberOfBuckets(int numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    public int getBucketValue() {
        return bucketValue;
    }

    public void setBucketValue(int bucketValue) {
        this.bucketValue = bucketValue;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
