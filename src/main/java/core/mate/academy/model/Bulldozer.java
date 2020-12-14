package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeArea;

    public Bulldozer() {
    }

    public Bulldozer(int bladeArea, String name, String color) {
        super(name, color);
        this.bladeArea = bladeArea;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
