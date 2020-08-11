package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */

public class Track extends Machine {
    private int length;
    private String brand;

    public Track() {

    }

    public Track(int length, String brand) {
        this.length = length;
        this.brand = brand;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
