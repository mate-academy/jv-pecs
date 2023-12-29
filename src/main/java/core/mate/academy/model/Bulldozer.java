package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerBucket;
    private String trackModel;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBulldozerBucket() {
        return bulldozerBucket;
    }

    public void setBulldozerBucket(String bulldozerBucket) {
        this.bulldozerBucket = bulldozerBucket;
    }

    public String getTrackModel() {
        return trackModel;
    }

    public void setTrackModel(String trackModel) {
        this.trackModel = trackModel;
    }
}
