package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private double bucketMaxLoad;

    public Excavator() {
    }

    public Excavator(String engine, int maxSpeedKmH, double bucketMaxLoad) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.bucketMaxLoad = bucketMaxLoad;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMaxSpeedKmH() {
        return maxSpeedKmH;
    }

    public void setMaxSpeedKmH(int maxSpeedKmH) {
        this.maxSpeedKmH = maxSpeedKmH;
    }

    public double getBucketMaxLoad() {
        return bucketMaxLoad;
    }

    public void setBucketMaxLoad(double bucketMaxLoad) {
        this.bucketMaxLoad = bucketMaxLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
