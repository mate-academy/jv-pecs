package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeWidth) {
        super(name, color);
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println(getColor() + " bulldozer"
                + getName() + "started to work. Blade width is "
                + bladeWidth + " meters.");
    }
}
