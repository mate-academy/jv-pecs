package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    protected int trackGauge;
    protected int grouserHeight;
    protected int trackPitch;

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
}
