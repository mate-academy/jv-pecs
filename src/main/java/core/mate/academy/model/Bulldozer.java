package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean tracked;
    private double volume;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, boolean tracked, double volume) {
        setName(name);
        setColor(color);
        this.tracked = tracked;
        this.volume = volume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isTracked() {
        return tracked;
    }

    public void setTracked(boolean tracked) {
        this.tracked = tracked;
    }
}
