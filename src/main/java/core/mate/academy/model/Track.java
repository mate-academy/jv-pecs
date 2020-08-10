package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int numberWheels;

    public Track() {
    }

    public Track(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

}
