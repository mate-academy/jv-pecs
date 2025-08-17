package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxDiggingDepth;
    private int armLength;

    public Excavator(int maxDiggingDepth, int armLength) {
        this.maxDiggingDepth = maxDiggingDepth;
        this.armLength = armLength;
    }

    public Excavator() {
    }

    public int getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public Excavator setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
        return this;
    }

    public int getArmLength() {
        return armLength;
    }

    public Excavator setArmLength(int armLength) {
        this.armLength = armLength;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
