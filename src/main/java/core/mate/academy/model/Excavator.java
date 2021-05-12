package core.mate.academy.model;

public class Excavator extends Machine {
    private double diggingDepth;

    public Excavator(String name, String color, double diggingDepth) {
        super(name, color);
        this.diggingDepth = diggingDepth;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
