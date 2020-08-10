package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String series;
    private int wheelSum;

    public Track() {
    }

    public Track(String series, int wheelSum) {
        this.series = series;
        this.wheelSum = wheelSum;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
