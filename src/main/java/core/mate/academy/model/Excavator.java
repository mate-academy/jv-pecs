package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double diggingDepth;

    public Excavator() {
    }

    public Excavator(String name, String color, double diggingDepth) {
        super(name, color);
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println(getColor() + "excavator"
                + getName() + "started to work. Digging depth is "
                + diggingDepth + "meters.");
    }
}
