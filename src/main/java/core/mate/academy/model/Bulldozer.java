package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private String trackType;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth, String trackType) {
        this.bladeWidth = bladeWidth;
        this.trackType = trackType;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public Bulldozer setBladeWidth(Double bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    public String getTrackType() {
        return trackType;
    }

    public Bulldozer setTrackType(String trackType) {
        this.trackType = trackType;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
