package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxWeight;
    private int itsWeight;

    public Excavator() {
    }

    public Excavator(int maxWeight, int itsWeight) {
        this.maxWeight = maxWeight;
        this.itsWeight = itsWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
