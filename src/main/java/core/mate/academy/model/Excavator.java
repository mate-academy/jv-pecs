package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maximumBucketReach;

    public Excavator() {
    }

    public Excavator(String name, String color, int maximumBucketReach) {
        super.setName(name);
        super.setColor(color);
        this.maximumBucketReach = maximumBucketReach;
    }

    public int getMaximumBucketReach() {
        return maximumBucketReach;
    }

    public void setMaximumBucketReach(int maximumBucketReach) {
        this.maximumBucketReach = maximumBucketReach;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
