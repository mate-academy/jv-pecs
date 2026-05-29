package core.mate.academy.model;

public class Excavator extends Machine {
    private double maxDiggingDepth;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(double maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }
}
