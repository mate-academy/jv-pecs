package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private boolean ladle;
    private int weight;

    public Excavator() {
    }

    public Excavator(boolean ladle, int weight) {
        this.ladle = ladle;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
