package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeWidth;
    private int enginePower;

    public Bulldozer(String name, String color, double bladeWidth, int enginePower) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.enginePower = enginePower;
    }

    public Bulldozer() {
        super();
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
