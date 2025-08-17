package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String transmissionType;
    private int trackWidth;
    private int bucketArea;

    public Bulldozer() {
    }

    public Bulldozer(String transmissionType, int trackWidth, int bucketArea) {
        this.transmissionType = transmissionType;
        this.trackWidth = trackWidth;
        this.bucketArea = bucketArea;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public int getBucketArea() {
        return bucketArea;
    }

    public void setBucketArea(int bucketArea) {
        this.bucketArea = bucketArea;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
