package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeSize;
    private float trackWidth;

    public Bulldozer() {

    }

    public Bulldozer(int bladeSize, float trackWidth, String name, String color) {
        this.bladeSize = bladeSize;
        this.trackWidth = trackWidth;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
