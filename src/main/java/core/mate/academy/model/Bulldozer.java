package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;
    private int rippingDepth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeWidth, int rippingDepth) {
        setName(name);
        setColor(color);
        this.bladeWidth = bladeWidth;
        this.rippingDepth = rippingDepth;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getRippingDepth() {
        return rippingDepth;
    }

    public void setRippingDepth(int rippingDepth) {
        this.rippingDepth = rippingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
