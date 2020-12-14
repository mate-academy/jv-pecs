package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String bucket;
    private String cab;
    private String trackName;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getCab() {
        return cab;
    }

    public void setCab(String cab) {
        this.cab = cab;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
}
