package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean isTracked;

    public Bulldozer() {
    }

    public boolean isTracked() {
        return isTracked;
    }

    public void setTracked(boolean tracked) {
        isTracked = tracked;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
