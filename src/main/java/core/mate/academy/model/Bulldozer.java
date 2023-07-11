package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeHeight;
    private double rippingDepth;

    public Bulldozer() {
    }

    public double getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(double bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    public double getRippingDepth() {
        return rippingDepth;
    }

    public void setRippingDepth(double rippingDepth) {
        this.rippingDepth = rippingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
