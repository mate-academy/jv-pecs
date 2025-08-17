package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean isTracked;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, boolean isTracked) {
        this.isTracked = isTracked;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
