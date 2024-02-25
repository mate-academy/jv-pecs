package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int bucketCapacity;
    private int maxDiggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketCapacity, int maxDiggingDepth) {
        setName(name);
        setColor(color);
        this.bucketCapacity = bucketCapacity;
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
