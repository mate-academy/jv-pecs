package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;
    private int bladeLift;

    public Bulldozer() {
    }

    public Bulldozer(int bladeLength, int bladeLift) {
        this.bladeLength = bladeLength;
        this.bladeLift = bladeLift;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
