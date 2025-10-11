package core.mate.academy.model;

public class Bulldozer extends Machine implements Workable {
    private String model;
    private double bladeWidth;
    private int horsePower;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public Bulldozer(String model, double bladeWidth, int horsePower, boolean hasRipper) {
        this.model = model;
        this.bladeWidth = bladeWidth;
        this.horsePower = horsePower;
        this.hasRipper = hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isHasRipper() {
        return hasRipper;
    }

    public void setHasRipper(boolean hasRipper) {
        this.hasRipper = hasRipper;
    }
}
