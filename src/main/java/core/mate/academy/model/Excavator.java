package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int enginePower;
    private int weight;

    public Excavator() {
    }

    public Excavator(String name, String color, int enginePower, int weight) {
        super(name,color);
        this.enginePower = enginePower;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
