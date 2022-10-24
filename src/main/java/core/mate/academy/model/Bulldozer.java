package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int trackGauge;

    public Bulldozer(String name, String color, int trackGauge) {
        super(name, color);
        this.trackGauge = trackGauge;
    }

    public Bulldozer() {
    }

    public int getTrackGauge() {
        return trackGauge;
    }

    public void setTrackGauge(int trackGauge) {
        this.trackGauge = trackGauge;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
