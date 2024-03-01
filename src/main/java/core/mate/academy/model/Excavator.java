package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int overallLength;
    private int wheelbase;
    private int maximumDiggingDepth;

    public Excavator() {
    }

    public Excavator(int overallLength, int wheelbase, int maximumDiggingDepth) {
        this.overallLength = overallLength;
        this.wheelbase = wheelbase;
        this.maximumDiggingDepth = maximumDiggingDepth;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
