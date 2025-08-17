package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeLength;

    public Bulldozer() {
    }

    public Bulldozer(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
