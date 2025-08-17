package core.mate.academy.model;

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

    public void setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public int getArmLength() {
        return armLength;
    }

    public void setArmLength(int armLength) {
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
