package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int diggingDepth;
    private boolean availabilityOfHydraulics;

    public Excavator(int diggingDepth, boolean availabilityOfHydraulics) {
        this.diggingDepth = diggingDepth;
        this.availabilityOfHydraulics = availabilityOfHydraulics;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
