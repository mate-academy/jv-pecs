package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeLength;
    private boolean isBladeToTheFront;
    private String tracksType;

    public Bulldozer() {
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public boolean isBladeToTheFront() {
        return isBladeToTheFront;
    }

    public void setBladeToTheFront(boolean bladeToTheFront) {
        isBladeToTheFront = bladeToTheFront;
    }

    public String getTracksType() {
        return tracksType;
    }

    public void setTracksType(String tracksType) {
        this.tracksType = tracksType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
