package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weight;
    private int length;

    public Excavator() {
    }

    public Excavator(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
