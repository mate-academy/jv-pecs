package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String boomType;
    private double diggingDepth;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, String boomType,
                     double diggingDepth, double bucketCapacity) {
        super(name, color);
        this.boomType = boomType;
        this.diggingDepth = diggingDepth;
        this.bucketCapacity = bucketCapacity;
    }

    public String getBoomType() {
        return boomType;
    }

    public void setBoomType(String boomType) {
        this.boomType = boomType;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
