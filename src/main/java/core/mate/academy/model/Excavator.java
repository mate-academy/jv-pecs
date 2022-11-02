package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int unloadingRange;
    private double diggingDepth;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, String manufacturer,
                      int unloadingRange, double diggingDepth, double bucketCapacity) {
        super(name, color, manufacturer);
        this.unloadingRange = unloadingRange;
        this.diggingDepth = diggingDepth;
        this.bucketCapacity = bucketCapacity;
    }

    public int getUnloadingRange() {
        return unloadingRange;
    }

    public void setUnloadingRange(int unloadingRange) {
        this.unloadingRange = unloadingRange;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
