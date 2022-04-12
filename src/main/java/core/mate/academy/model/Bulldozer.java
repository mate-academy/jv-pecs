package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private int bladeSize;
    private String bladeType;

    public Bulldozer(int bladeSize, String bladeType) {
        this.bladeSize = bladeSize;
        this.bladeType = bladeType;
    }

    public Bulldozer() {
    }

    public int getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(int bladeSize) {
        this.bladeSize = bladeSize;
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
