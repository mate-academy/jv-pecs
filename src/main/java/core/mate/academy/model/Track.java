package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int howLong;
    private int maxSpeed;

    public Track() {
    }

    public Track(int howLong, int maxSpeed) {
        this.howLong = howLong;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
