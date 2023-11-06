package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double maxDiggingDepth;

    public Excavator() {

    }

    public Excavator(String name, String color, double maxDiggingDepth) {
        super.setName(name);
        super.setColor(color);
        this.maxDiggingDepth = maxDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String toString() {
        return "Excavator{name -"
                + super.getName()
                + ", color - "
                + super.getColor()
                + " maxDiggingDepth = "
                + maxDiggingDepth
                + '}';
    }
}
