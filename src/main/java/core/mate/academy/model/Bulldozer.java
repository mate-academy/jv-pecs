package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private Double bladeWidth;

    public Bulldozer() {
    }

    public Double getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(Double bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
