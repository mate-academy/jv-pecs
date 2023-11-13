package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity;
    private double maxDigDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketCapacity, double maxDigDepth) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.maxDigDepth = maxDigDepth;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getMaxDigDepth() {
        return maxDigDepth;
    }

    public void setMaxDigDepth(double maxDigDepth) {
        this.maxDigDepth = maxDigDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
