package core.mate.academy.model;

public class Excavator extends Machine {
    private double diggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, double diggingDepth) {
        setName(name);
        setColor(color);
        this.diggingDepth = diggingDepth;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
