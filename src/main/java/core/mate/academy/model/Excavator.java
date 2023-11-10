package core.mate.academy.model;

public class Excavator extends Machine {
    private double diggingDepth;
    private boolean hasBucket;

    public Excavator() {
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public boolean isHasBucket() {
        return hasBucket;
    }

    public void setHasBucket(boolean hasBucket) {
        this.hasBucket = hasBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
