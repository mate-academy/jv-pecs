package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private int trackGauge;
    private int grouserHeight;
    private int trackPitch;

    public Bulldozer() {
    }

    public Bulldozer(int trackGauge, int grouserHeight, int trackPitch) {
        this.trackGauge = trackGauge;
        this.grouserHeight = grouserHeight;
        this.trackPitch = trackPitch;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getTrackGauge() {
        return this.trackGauge;
    }

    public int getGrouserHeight() {
        return this.grouserHeight;
    }

    public int getTrackPitch() {
        return this.trackPitch;
    }

    public void setTrackGauge(int trackGauge) {
        this.trackGauge = trackGauge;
    }

    public void setGrouserHeight(int grouserHeight) {
        this.grouserHeight = grouserHeight;
    }

    public void setTrackPitch(int trackPitch) {
        this.trackPitch = trackPitch;
    }
}
