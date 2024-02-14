package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int powerEngine;
    private String trackType;
    private String controlSystem;

    public Bulldozer(String name, String color,
                     int powerEngine, String trackType, String controlSystem) {
        super(name, color);
        this.powerEngine = powerEngine;
        this.trackType = trackType;
        this.controlSystem = controlSystem;
    }

    public Bulldozer() {
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    public String getControlSystem() {
        return controlSystem;
    }

    public void setControlSystem(String controlSystem) {
        this.controlSystem = controlSystem;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
