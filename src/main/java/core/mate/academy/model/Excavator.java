package core.mate.academy.model;

public class Excavator extends Machine {
    private int dumpArea;

    public Excavator() {
    }

    public int getDumpArea() {
        return dumpArea;
    }

    public void setDumpArea(int dumpArea) {
        this.dumpArea = dumpArea;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
