package core.mate.academy.model;

public class Excavator extends Machine {
    private int overallLength;
    private int trackWidth;
    private int height;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getOverallLength() {
        return overallLength;
    }

    public void setOverallLength(int overallLength) {
        this.overallLength = overallLength;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
