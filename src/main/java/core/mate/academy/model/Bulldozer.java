package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWeight;
    private int bladeLifting;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeLength,
                     int bladeWeight, int bladeLifting) {
        super(name, color);
        this.bladeLength = bladeLength;
        this.bladeWeight = bladeWeight;
        this.bladeLifting = bladeLifting;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    public int getBladeLifting() {
        return bladeLifting;
    }

    public void setBladeLifting(int bladeLifting) {
        this.bladeLifting = bladeLifting;
    }
}
