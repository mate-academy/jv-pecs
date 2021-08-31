package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private BladeType bladeType;

    public Bulldozer() {
    }

    public Bulldozer(BladeType bladeType) {
        this.bladeType = bladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public BladeType getBladeType() {
        return bladeType;
    }
}
