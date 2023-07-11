package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double maxDiggingDepth;
    private double maxReach;

    public Excavator() {
    }

    public double getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(double maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public double getMaxReach() {
        return maxReach;
    }

    public void setMaxReach(double maxReach) {
        this.maxReach = maxReach;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
