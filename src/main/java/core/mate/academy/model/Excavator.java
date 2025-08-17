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
}
