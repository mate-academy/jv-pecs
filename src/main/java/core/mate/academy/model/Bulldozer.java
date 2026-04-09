package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private String trackType;
    private int enginePower;

    public Bulldozer(double bladeWidth, String trackType, int enginePower) {
        this.bladeWidth = bladeWidth;
        this.trackType = trackType;
        this.enginePower = enginePower;
    }

    public Bulldozer() {

    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
}
