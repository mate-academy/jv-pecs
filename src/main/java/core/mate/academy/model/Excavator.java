package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private String boomConfiguration;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public void setBoomConfiguration(String boomConfiguration) {
        this.boomConfiguration = boomConfiguration;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public String getBoomConfiguration() {
        return boomConfiguration;
    }
}
