package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketReach;

    public Excavator() {
    }

    public Excavator(int bucketReach) {
        this.bucketReach = bucketReach;
    }

    public int getBucketReach() {
        return bucketReach;
    }

    public Excavator setBucketReach(int bucketReach) {
        this.bucketReach = bucketReach;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
