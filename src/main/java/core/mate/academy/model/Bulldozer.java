package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bladeWidth;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bladeWidth, boolean hasRipper) {
        super(name, color);
        this.bladeWidth = bladeWidth;
        this.hasRipper = hasRipper;
    }

    public double getBladeWidth() {
        return bladeWidth;
    }

    public boolean hasRipper() {
        return hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
