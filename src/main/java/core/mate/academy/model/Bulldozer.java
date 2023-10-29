package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private int maxLoadCapacity;

    public Bulldozer() {
        super();
    }

    public Bulldozer(String name, String color, double bladeWidth, int maxLoadCapacity) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
