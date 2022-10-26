package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketWeight;

    public Excavator() {
    }

    public void setBucketWeight(int bucketWeight) {
        this.bucketWeight = bucketWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
