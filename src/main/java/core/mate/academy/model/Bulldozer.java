package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private int bladeWidth;

    public Bulldozer() {
        super("default_name", "default_color");
    }

    public Bulldozer(String name, String color, int enginePower, int bladeWidth) {
        super(name, color);
        this.enginePower = enginePower;
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
