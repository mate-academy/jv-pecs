package core.mate.academy.model;

public class Excavator extends Machine {
    private int maxDiggingDepth;
    private int maxDozerLift;

    public Excavator() {
    }

    public Excavator(String name, String color, int maxDiggingDepth, int maxDozerLift) {
        super(name, color);
        this.maxDiggingDepth = maxDiggingDepth;
        this.maxDozerLift = maxDozerLift;
    }

    public int getMaxDiggingDepth() {
        return maxDiggingDepth;
    }

    public void setMaxDiggingDepth(int maxDiggingDepth) {
        this.maxDiggingDepth = maxDiggingDepth;
    }

    public int getMaxDozerLift() {
        return maxDozerLift;
    }

    public void setMaxDozerLift(int maxDozerLift) {
        this.maxDozerLift = maxDozerLift;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
