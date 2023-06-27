package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeLength;

    public Bulldozer() {
    }

    public Bulldozer(int bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getBladeLength() {
        return bladeLength;
    }

    public Bulldozer setBladeLength(int bladeLength) {
        this.bladeLength = bladeLength;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
