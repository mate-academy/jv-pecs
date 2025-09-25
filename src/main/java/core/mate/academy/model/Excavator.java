package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int numberOfExcavation;

    public Excavator() {
    }

    public int getNumberOfExcavation() {
        return numberOfExcavation;
    }

    public void setNumberOfExcavation(int numberOfExcavation) {
        this.numberOfExcavation = numberOfExcavation;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
