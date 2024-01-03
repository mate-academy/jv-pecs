package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorType;
    private double diggingDepth;

    public Excavator() {
    }

    public Excavator(String excavatorType, double diggingDepth) {
        this.excavatorType = excavatorType;
        this.diggingDepth = diggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
