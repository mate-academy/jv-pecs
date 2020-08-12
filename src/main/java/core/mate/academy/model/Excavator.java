package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int weight;
    private String model;

    public Excavator() {
    }

    public Excavator(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
