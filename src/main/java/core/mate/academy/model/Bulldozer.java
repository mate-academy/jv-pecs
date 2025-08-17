package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int widthOfSteelPlate;
    private boolean isDigging;

    public Bulldozer(int widthOfSteelPlate, boolean isDigging) {
        this.widthOfSteelPlate = widthOfSteelPlate;
        this.isDigging = isDigging;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
