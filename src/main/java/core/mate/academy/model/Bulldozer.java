package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int operatingWeight;
    private int bladeWidth;

    public Bulldozer(int operatingWeight, int bladeWidth) {
        this.operatingWeight = operatingWeight;
        this.bladeWidth = bladeWidth;
    }

    public Bulldozer() {
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public Bulldozer setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
        return this;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public Bulldozer setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
