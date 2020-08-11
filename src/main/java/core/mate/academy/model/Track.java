package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int carrying;
    private int power;

    public Track() {
    }

    public Track(int carrying, int power) {
        this.carrying = carrying;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
