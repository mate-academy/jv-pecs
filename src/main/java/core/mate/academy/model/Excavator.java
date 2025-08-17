package core.mate.academy.model;

public class Excavator extends Machine {
    private double maxDiggingDepth;
    private double bucketCapacity;
    private double lengthBoom;

    public Excavator(
            String name, String color, double maxDiggingDepth,
            double bucketCapacity, double lengthBoom) {
        super(name, color);
        this.maxDiggingDepth = maxDiggingDepth;
        this.bucketCapacity = bucketCapacity;
        this.lengthBoom = lengthBoom;
    }

    public Excavator(String name, String color) {
        super(color, name);
    }

    public Excavator() {
    }

    public double getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(double maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getLengthBoom() {
        return lengthBoom;
    }

    public void setLengthBoom(double lengthBoom) {
        this.lengthBoom = lengthBoom;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
