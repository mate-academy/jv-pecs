package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String type;
    private double bladeCapacity;
    private boolean isTrack;

    public Bulldozer() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(double bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    public boolean isTrack() {
        return isTrack;
    }

    public void setTrack(boolean track) {
        isTrack = track;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}