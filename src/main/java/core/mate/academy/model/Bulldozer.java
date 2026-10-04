package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private int pushingCapacity;

    public Bulldozer() {
    }

    public int getPushingCapacity() {
        return pushingCapacity;
    }

    public void setPushingCapacity(int pushingCapacity) {
        this.pushingCapacity = pushingCapacity;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
