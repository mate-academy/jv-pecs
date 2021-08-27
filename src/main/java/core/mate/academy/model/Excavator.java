package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxHeight;

    public Excavator() {
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxPower) {
        this.maxHeight = maxPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
