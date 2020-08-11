package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String typeOfTrack;
    private int capacity;

    public Track() {
    }

    public Track(String typeOfTrack, int capacity) {
        this.typeOfTrack = typeOfTrack;
        this.capacity = capacity;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
