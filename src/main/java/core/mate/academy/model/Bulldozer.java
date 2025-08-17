package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int operatingWeight;
    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(int operatingWeight, int bladeWidth) {
        this.operatingWeight = operatingWeight;
        this.bladeWidth = bladeWidth;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
