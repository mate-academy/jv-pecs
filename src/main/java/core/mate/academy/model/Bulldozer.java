package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;
    private boolean hasExtraFunctions;

    public Bulldozer() {
    }

    public Bulldozer(int bladeWidth, boolean hasExtraFunctions) {
        this.bladeWidth = bladeWidth;
        this.hasExtraFunctions = hasExtraFunctions;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
