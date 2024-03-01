package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladedLength;
    private int bladeWeight;
    private int bladeLift;

    public Bulldozer() {
    }

    public Bulldozer(int bladedLength, int bladeWeight, int bladeLift) {
        this.bladedLength = bladedLength;
        this.bladeWeight = bladeWeight;
        this.bladeLift = bladeLift;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
