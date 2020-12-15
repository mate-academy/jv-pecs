package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bucketVolume;
    private boolean track;

    public Bulldozer() {
    }

    public Bulldozer(int bucketVolume, boolean track) {
        this.bucketVolume = bucketVolume;
        this.track = track;
    }

    public int getBucketVolume() {
        return bucketVolume;
    }

    public boolean isTrack() {
        return track;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
