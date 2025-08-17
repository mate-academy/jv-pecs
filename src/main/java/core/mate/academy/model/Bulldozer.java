package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double dumpWidth;
    private String color;

    public Bulldozer() {
    }

    public double getDumpWidth() {
        return dumpWidth;
    }

    public void setDumpWidth(double dumpWidth) {
        this.dumpWidth = dumpWidth;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
