package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeLength;
    private double bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bladeLength, double bladeWeight) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public double getBladeWeight() {
        return bladeWeight;
    }

    public void setBladeWeight(double bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
