package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketDepth;
    private int excavatorWeight;

    public Excavator(int bucketDepth, int excavatorWeight) {
        this.bucketDepth = bucketDepth;
        this.excavatorWeight = excavatorWeight;
    }

    public Excavator() {
    }

    public int getBucketDepth() {
        return bucketDepth;
    }

    public void setBucketDepth(int bucketDepth) {
        this.bucketDepth = bucketDepth;
    }

    public int getExcavatorWeight() {
        return excavatorWeight;
    }

    public void setExcavatorWeight(int excavatorWeight) {
        this.excavatorWeight = excavatorWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
