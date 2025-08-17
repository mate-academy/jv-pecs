package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public static final int MIN_BLADE_WIDTH = 50;
    public static final int MAX_BLADE_WIDTH = 300;
    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int power, int bladeWidth) {
        super(name, color, power);
        this.bladeWidth = bladeWidth;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
