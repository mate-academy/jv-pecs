package core.mate.academy.model;

public class Excavator extends Machine {
    private double swingSpeed;
    private double maxFlow;
    private double bucketCapacity;
    private double maxDiggingDepth;
    private double groundClearance;

    public Excavator() {
    }

    public Excavator(String name, String color, double swingSpeed, double maxFlow,
                     double bucketCapacity, double maxDiggingDepth, double groundClearance) {
        super(name, color);
        this.swingSpeed = swingSpeed;
        this.maxFlow = maxFlow;
        this.bucketCapacity = bucketCapacity;
        this.maxDiggingDepth = maxDiggingDepth;
        this.groundClearance = groundClearance;
    }

    public Excavator(String name, String color) {
        super(name, color);
    }

    public double getSwingSpeed() {
        return swingSpeed;
    }

    public void setSwingSpeed(double swingSpeed) {
        this.swingSpeed = swingSpeed;
    }

    public double getMaxFlow() {
        return maxFlow;
    }

    public void setMaxFlow(double maxFlow) {
        this.maxFlow = maxFlow;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(double maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public double getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(double groundClearance) {
        this.groundClearance = groundClearance;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
