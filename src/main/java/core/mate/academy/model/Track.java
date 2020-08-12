package core.mate.academy.model;

public class Track extends Machine {
    private int range;
    private double acceleration;

    public Track() {
    }

    public Track(int range, double acceleration) {
        this.range = range;
        this.acceleration = acceleration;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
