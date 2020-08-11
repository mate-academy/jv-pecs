package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {

    private int distance;
    private int wheels;
    private String tentColor;

    public Track() {
    }

    public Track(int distance, int wheels, String colour) {
        this.distance = distance;
        this.wheels = wheels;
        this.tentColor = colour;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColour() {
        return tentColor;
    }

    public void setColour(String colour) {
        this.tentColor = colour;
    }
}
