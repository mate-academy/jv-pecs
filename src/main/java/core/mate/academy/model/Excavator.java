package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double fuelTankCap;
    private int boomLength;

    public Excavator() {
    }

    public double getFuelTankCap() {
        return fuelTankCap;
    }

    public void setFuelTankCap(double fuelTankCap) {
        this.fuelTankCap = fuelTankCap;
    }

    public int getBoomLength() {
        return boomLength;
    }

    public void setBoomLength(int boomLength) {
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
