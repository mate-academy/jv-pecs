package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int shovelSize;

    public Excavator() {
    }

    public Excavator(int shovelSize) {
        this.shovelSize = shovelSize;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
