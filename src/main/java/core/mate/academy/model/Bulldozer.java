package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeSize;

    public Bulldozer() {
    }

    public double getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(double bladeSize) {
        this.bladeSize = bladeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

}
