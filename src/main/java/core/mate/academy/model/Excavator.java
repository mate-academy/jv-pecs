package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketCapacity;
    private int bucketWidth;
    private int diggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color,
                     double bucketCapacity, int bucketWidth, int diggingDepth) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.bucketWidth = bucketWidth;
        this.diggingDepth = diggingDepth;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public int getBucketWidth() {
        return bucketWidth;
    }

    public void setBucketWidth(int bucketWidth) {
        this.bucketWidth = bucketWidth;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
