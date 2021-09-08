package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeSize;

    public Bulldozer() {
    }

    public Bulldozer(int bladeSize, String name, String color) {
        this.bladeSize = bladeSize;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
