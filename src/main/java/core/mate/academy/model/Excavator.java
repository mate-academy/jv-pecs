package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean hasBucket;
    private boolean hasArm;

    public Excavator() {
    }

    public Excavator(boolean hasBucket, boolean hasArm) {
        this.hasBucket = hasBucket;
        this.hasArm = hasArm;
    }

    @Override
    public void doWork() {
    }
}
