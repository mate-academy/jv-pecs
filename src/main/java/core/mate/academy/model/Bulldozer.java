package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private double bladeWidth;
    private double bladeHeight;
    private double bladeCapacity;

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

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
