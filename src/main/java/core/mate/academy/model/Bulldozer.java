package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private double bladeHeight;
    private double bladeCapacity;
    private double diggingDepth;

    public Bulldozer(double bladeWidth, double bladeHeight, double bladeCapacity,
                     double diggingDepth) {
        this.bladeWidth = bladeWidth;
        this.bladeHeight = bladeHeight;
        this.bladeCapacity = bladeCapacity;
        this.diggingDepth = diggingDepth;
    }

    public Bulldozer() {
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public double getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(double bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    public double getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(double bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
