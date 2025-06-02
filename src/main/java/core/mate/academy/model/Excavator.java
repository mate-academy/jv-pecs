package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity;
    private boolean isWheeled;

    public Excavator() {
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public boolean isWheeled() {
        return isWheeled;
    }

    public void setWheeled(boolean wheeled) {
        isWheeled = wheeled;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
