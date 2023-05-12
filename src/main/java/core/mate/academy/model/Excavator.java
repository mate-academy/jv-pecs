package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double bucketCapacity;
    private String tracksOrWheels;

    public Excavator() {
        super("default name", "default color");
    }

    public Excavator(String name, String color, double bucketCapacity, String tracksOrWheels) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.tracksOrWheels = tracksOrWheels;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getTracksOrWheels() {
        return tracksOrWheels;
    }

    public void setTracksOrWheels(String tracksOrWheels) {
        this.tracksOrWheels = tracksOrWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
