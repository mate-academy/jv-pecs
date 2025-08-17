package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeWidth;
    private int bladeHeight;
    private int bladeWeight;

    public Bulldozer() {
    }

    public Bulldozer(int bladeLength, int bladeWidth, int bladeHeight, int bladeWeight) {
        this.bladeLength = bladeLength;
        this.bladeWidth = bladeWidth;
        this.bladeHeight = bladeHeight;
        this.bladeWeight = bladeWeight;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public int getBladeHeight() {
        return bladeHeight;
    }

    public int getBladeWeight() {
        return bladeWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
