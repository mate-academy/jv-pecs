package core.mate.academy.model;

public class Excavator extends Machine {
    private int diggingDepth;
    private int operatingWeight;

    public Excavator() {
    }

    public Excavator(int diggingDepth, int operatingWeight) {
        this.diggingDepth = diggingDepth;
        this.operatingWeight = operatingWeight;
    }

    public int getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(int diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
