package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int id;

    public Track() {
    }

    public Track(String name, int id) {
        super.setName(name);
        super.setColor("RED");
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
