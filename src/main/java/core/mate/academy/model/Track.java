package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String model;
    private int id;

    public Track() {
    }

    public Track(String model, int id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
