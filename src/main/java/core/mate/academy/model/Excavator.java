package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private boolean hasHammerAttachment;
    private String diggingDepth;

    public Excavator() {
    }

    public Excavator(int bucketCapacity, boolean hasHammerAttachment, String diggingDepth) {
        this.bucketCapacity = bucketCapacity;
        this.hasHammerAttachment = hasHammerAttachment;
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public boolean isHasHammerAttachment() {
        return hasHammerAttachment;
    }

    public void setHasHammerAttachment(boolean hasHammerAttachment) {
        this.hasHammerAttachment = hasHammerAttachment;
    }

    public String getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(String diggingDepth) {
        this.diggingDepth = diggingDepth;
    }
}
