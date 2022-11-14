package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWeight;

    public Bulldozer() {
    }

    public void setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public void setBladeWeight(int bladeWeight) {
        this.bladeWeight = bladeWeight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
