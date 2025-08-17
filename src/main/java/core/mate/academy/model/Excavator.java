package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int diggingDepth;

    public Excavator(String name, String color, int bucketCapacity, int diggingDepth) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.diggingDepth = diggingDepth;
    }

    public Excavator() {
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
