package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String trackType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String trackType) {
        super(name, color);
        this.trackType = trackType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
