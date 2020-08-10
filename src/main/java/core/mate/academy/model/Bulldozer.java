package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int suspensionCapacity;
    private String bucketType;

    public Bulldozer() {
    }

    public Bulldozer(int suspensionCapacity, String bucketType) {
        this.suspensionCapacity = suspensionCapacity;
        this.bucketType = bucketType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    public int getSuspensionCapacity() {
        return suspensionCapacity;
    }

    public void setSuspensionCapacity(int suspensionCapacity) {
        this.suspensionCapacity = suspensionCapacity;
    }
}
