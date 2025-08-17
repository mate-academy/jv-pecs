package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int tractionClass;
    private double trackGauge;

    public Bulldozer() {
    }

    public int getTractionClass() {
        return tractionClass;
    }

    public void setTractionClass(int tractionClass) {
        this.tractionClass = tractionClass;
    }

    public double getTrackGauge() {
        return trackGauge;
    }

    public void setTrackGauge(double trackGauge) {
        this.trackGauge = trackGauge;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
