package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int trackId;
    private String trackName;

    public Track() {
    }

    public int getId() {
        return trackId;
    }

    public void setId(int id) {
        this.trackId = id;
    }

    @Override
    public String getName() {
        return trackName;
    }

    @Override
    public void setName(String name) {
        this.trackName = name;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
