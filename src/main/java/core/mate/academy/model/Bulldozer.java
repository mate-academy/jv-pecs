package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeType;
    private int bladeWidth;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public Bulldozer(String bladeType, int bladeWidth, boolean hasRipper) {
        this.bladeType = bladeType;
        this.bladeWidth = bladeWidth;
        this.hasRipper = hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public boolean isHasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }
}
