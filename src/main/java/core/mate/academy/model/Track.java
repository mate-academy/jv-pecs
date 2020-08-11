package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    int weight;
    String model;

    public Track() {
    }

    public Track(int weigh, String model) {
        this.weight = weigh;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
