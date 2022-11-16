package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeLength;
    private double bladeWidth;
    private double bladeHeight;
    private int bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bladeLength,
                     double bladeWidth, double bladeHeight, int bladeWeight) {
        setName(name);
        setColor(color);
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
        this.bladeHeight = bladeHeight;
        this.bladeWeight = bladeWeight;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public double getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(double bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
