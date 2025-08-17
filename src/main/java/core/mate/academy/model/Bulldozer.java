package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeHeight;

    public Bulldozer() {
    }

    public Bulldozer(int bladeHeight, int bladeLength) {
        this.bladeHeight = bladeHeight;
        this.bladeLength = bladeLength;
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

    public int getBladeHeight() {
        return bladeHeight;
    }

    public void setBladeHeight(int bladeHeight) {
        this.bladeHeight = bladeHeight;
    }

    @Override
    public String toString() {
        return "Bulldozer{"
                + "bladeLength="
                + bladeLength
                + ", bladeHeight="
                + bladeHeight
                + '}';
    }
}
