package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int capacity;
    private int speed;

    public Track() {
    }

    public Track(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
