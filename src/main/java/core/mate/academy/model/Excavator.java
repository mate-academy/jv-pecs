package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private String typeOfBucket;
    private double bucketCapacity;
    private double diggingDepth;

    public Excavator() {
    }

    public String getTypeOfBucket() {
        return typeOfBucket;
    }

    public void setTypeOfBucket(String typeOfBucket) {
        this.typeOfBucket = typeOfBucket;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
