package core.mate.academy.model;

public class Excavator extends Machine {
    private int diggingDepth;

    public Excavator(String name, String color, int diggingDepth) {
        super(name, color);
        this.diggingDepth = diggingDepth;
    }

    public Excavator() {
        super("Excavator", "Black");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getName() + " started to work");
    }
}
