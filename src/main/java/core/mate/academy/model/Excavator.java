package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maximumFloorNumbers;

    public Excavator() {
        maximumFloorNumbers = 2;
    }

    public int getMaximumFloorNumbers() {
        return maximumFloorNumbers;
    }

    public void setMaximumFloorNumbers(int maximumFloorNumbers) {
        this.maximumFloorNumbers = maximumFloorNumbers;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
