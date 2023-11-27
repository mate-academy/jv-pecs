package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String bucketModel;
    private double boomLength;

    public Excavator() {
    }

    public Excavator(String bucketModel, double boomLength) {
        this.bucketModel = bucketModel;
        this.boomLength = boomLength;
    }

    public String getBucketModel() {
        return bucketModel;
    }

    public void setBucketModel(String bucketModel) {
        this.bucketModel = bucketModel;
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
