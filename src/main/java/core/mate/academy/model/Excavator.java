package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity;
    private double diggingDepth;
    private double diggingRadius;
    private double unloadingHeight;

    public Excavator(double bucketCapacity, double diggingDepth, double diggingRadius,
                     double unloadingHeight) {
        this.bucketCapacity = bucketCapacity;
        this.diggingDepth = diggingDepth;
        this.diggingRadius = diggingRadius;
        this.unloadingHeight = unloadingHeight;
    }

    public Excavator() {
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

    public double getDiggingRadius() {
        return diggingRadius;
    }

    public void setDiggingRadius(double diggingRadius) {
        this.diggingRadius = diggingRadius;
    }

    public double getUnloadingHeight() {
        return unloadingHeight;
    }

    public void setUnloadingHeight(double unloadingHeight) {
        this.unloadingHeight = unloadingHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
