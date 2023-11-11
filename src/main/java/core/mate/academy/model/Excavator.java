package core.mate.academy.model;

public class Excavator extends Machine {
    private double diggingDepth;
    private boolean hasBucket;

    public Excavator() {
    }

    public Excavator(String name, String color, double diggingDepth, boolean hasBucket) {
        super(name, color);
        this.diggingDepth = diggingDepth;
        this.hasBucket = hasBucket;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public boolean hasBucket() {
        return hasBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
