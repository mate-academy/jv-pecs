package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private int speed;
    private String transmission;

    public Track() {
    }

    public Track(int speed, String transmission, String name, String color) {
        this.speed = speed;
        this.transmission = transmission;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
