package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private final int height;

    public Excavator() {
        height = 15;
    }

    @Override
    public void doWork() {
        System.out.println(height + " meter excavator started to work");
    }
}
