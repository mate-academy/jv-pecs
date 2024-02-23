package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bladeType;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public String getBladeType() {
        return bladeType;
    }

    public void setBladeType(String bladeType) {
        this.bladeType = bladeType;
    }

    public boolean isHasRipper() {
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
