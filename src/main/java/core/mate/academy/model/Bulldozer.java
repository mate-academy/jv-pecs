package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private float bucketCapacity;
    private String trackType;

    public Bulldozer() {

    }

    public Bulldozer(float bucketCapacity, String trackType) {
        this.bucketCapacity = bucketCapacity;
        this.trackType = trackType;
    }

    public float getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(float bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
