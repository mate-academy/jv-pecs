package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int frontBladeStroke;
    private boolean isTracked;

    public Bulldozer() {
    }

    public Bulldozer(boolean isTracked, int frontBladeStroke) {
        this.isTracked = isTracked;
        this.frontBladeStroke = frontBladeStroke;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
