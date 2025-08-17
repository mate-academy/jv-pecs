package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double maxLiftingWeight;
    private double bucketCapacity;
    private double boomLength;

    public Excavator(
            String name, String color,
            double maxLiftingWeight, double bucketCapacity,
            double boomLength) {
        super(name, color);
        this.maxLiftingWeight = maxLiftingWeight;
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
    }

    public Excavator(String name, String color) {
        super(name, color);
    }

    public Excavator() {
    }

    public double getMaxLiftingWeight() {
        return maxLiftingWeight;
    }

    public void setMaxLiftingWeight(double maxLiftingWeight) {
        this.maxLiftingWeight = maxLiftingWeight;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(double boomLength) {
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
