package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSize;
    private boolean hasRipper;

    public Bulldozer() {

    }

    public Bulldozer(int bladeSize, boolean hasRipper) {
        this.bladeSize = bladeSize;
        this.hasRipper = hasRipper;
    }

    public int getBladeSize() {
        return bladeSize;
    }

    public void setBladeSize(int bladeSize) {
        this.bladeSize = bladeSize;
    }

    public boolean hasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
