package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorDriverAge = 20;

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getExcavatorDriverAge() {
        return excavatorDriverAge;
    }

    public void setExcavatorDriverAge(int excavatorDriverAge) {
        this.excavatorDriverAge = excavatorDriverAge;
    }
}
