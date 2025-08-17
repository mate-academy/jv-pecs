package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */

public class Excavator extends Machine {
    private String model;
    private int weight;

    public Excavator(String name, String color, String model, int weight) {
        super(name, color);
        this.model = model;
        this.weight = weight;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
