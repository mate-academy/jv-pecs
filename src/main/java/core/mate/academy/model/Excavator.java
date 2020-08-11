package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String undercarriage;
    private int bucketCapacity;

    public Excavator() {
    }

    public String getUndercarriage() {
        return undercarriage;
    }

    public void setUndercarriage(String undercarriage) {
        this.undercarriage = undercarriage;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
