package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int trackLength;

    public Bulldozer() {
        super("default", "default");
    }

    public Bulldozer(String name, String color, int trackLength) {
        super(name, color);
        this.trackLength = trackLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
