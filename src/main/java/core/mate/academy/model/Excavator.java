package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private Integer bucketCapacity;
    private String bucketType;

    public Excavator() {
    }

    public Excavator(Integer bucketCapacity, String bucketType) {
        this.bucketCapacity = bucketCapacity;
        this.bucketType = bucketType;
    }

    public Integer getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(Integer bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
