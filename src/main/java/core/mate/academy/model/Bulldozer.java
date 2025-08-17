package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private boolean hasBlade;
    private boolean hasRipper;

    public Bulldozer() {
    }

    public Bulldozer(boolean hasBlade, boolean hasRipper) {
        this.hasBlade = hasBlade;
        this.hasRipper = hasRipper;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
