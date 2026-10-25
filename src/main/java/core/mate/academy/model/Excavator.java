package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity;
    private int maxDiggingDepth;

    public Excavator() {
    }

    public Excavator(double bucketCapacity, int maxDiggingDepth) {
        this.bucketCapacity = bucketCapacity;
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public Excavator setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
        return this;
    }

    public int getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public Excavator setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
