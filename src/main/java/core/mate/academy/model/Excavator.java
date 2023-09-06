package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketVolume;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(final double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
}
