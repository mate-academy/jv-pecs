package core.mate.academy.model;

public class Excavator extends Machine {
    private double frontBucketVolume;
    private double diggingWidth;
    private double diggingDepth;
    private double loadingHeight;

    public Excavator(String name, String color, double frontBucketVolume,
                     double diggingWidth, double diggingDepth, double loadingHeight) {
        super(name, color);
        this.frontBucketVolume = frontBucketVolume;
        this.diggingWidth = diggingWidth;
        this.diggingDepth = diggingDepth;
        this.loadingHeight = loadingHeight;
    }

    public Excavator() {
    }

    public void setFrontBucketVolume(double frontBucketVolume) {
        this.frontBucketVolume = frontBucketVolume;
    }

    public double getFrontBucketVolume() {
        return frontBucketVolume;
    }

    public void setDiggingWidth(double diggingWidth) {
        this.diggingWidth = diggingWidth;
    }

    public double getDiggingWidth() {
        return diggingWidth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setLoadingHeight(double loadingHeight) {
        this.loadingHeight = loadingHeight;
    }

    public double getLoadingHeight() {
        return loadingHeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
