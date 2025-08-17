package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;
    private double ripperDepth;
    private double fuelCapacity;

    public Bulldozer() {
    }

    public Bulldozer(double bladeWidth, double ripperDepth, double fuelCapacity) {
        this.bladeWidth = bladeWidth;
        this.ripperDepth = ripperDepth;
        this.fuelCapacity = fuelCapacity;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public double getRipperDepth() {
        return ripperDepth;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
