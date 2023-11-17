package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private double bucketMaxLoadKg;

    public Excavator() {
    }

    public Excavator(String engine, int maxSpeedKmH, double bucketMaxLoadKg) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.bucketMaxLoadKg = bucketMaxLoadKg;
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

    public double getBucketMaxLoadKg() {
        return bucketMaxLoadKg;
    }

    public void setBucketMaxLoadKg(double bucketMaxLoadKg) {
        this.bucketMaxLoadKg = bucketMaxLoadKg;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
