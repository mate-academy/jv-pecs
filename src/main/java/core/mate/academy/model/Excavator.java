package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int size;

    public Excavator() {
    }

    public Excavator(int size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
