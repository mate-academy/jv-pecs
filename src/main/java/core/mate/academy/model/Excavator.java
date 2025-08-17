package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double weightOfScoop;

    public Excavator() {
    }

    public Excavator(double weightOfScoop) {
        this.weightOfScoop = weightOfScoop;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
