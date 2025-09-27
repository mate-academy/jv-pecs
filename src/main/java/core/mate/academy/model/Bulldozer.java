package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int enginePower;
    private double bladeWidth;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public Bulldozer(int enginePower, double bladeWidth, boolean hasRipper) {
        this.enginePower = enginePower;
        this.bladeWidth = bladeWidth;
        this.hasRipper = hasRipper;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public boolean hasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
