package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketCapacity;
    private double maxDiggingDepth;
    private double reachRadius;

    public Excavator() {
    }

    public Excavator(double bucketCapacity, double maxDiggingDepth, double reachRadius) {
        this.bucketCapacity = bucketCapacity;
        this.maxDiggingDepth = maxDiggingDepth;
        this.reachRadius = reachRadius;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public double getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public double getReachRadius() {
        return reachRadius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
