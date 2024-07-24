package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private double operatingWeight;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth, double operatingWeight) {
        this.bladeWidth = bladeWidth;
        this.operatingWeight = operatingWeight;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public double getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(double operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
