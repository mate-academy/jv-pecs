package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double dumpArea;

    public Bulldozer() {
    }

    public double getDumpArea() {
        return dumpArea;
    }

    public void setDumpArea(double dumpArea) {
        this.dumpArea = dumpArea;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
