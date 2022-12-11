package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double diggingDepth;
    private int weight;
    private int enginePower;

    public Excavator(double diggingDepth, int weight, int enginePower) {
        this.diggingDepth = diggingDepth;
        this.weight = weight;
        this.enginePower = enginePower;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
