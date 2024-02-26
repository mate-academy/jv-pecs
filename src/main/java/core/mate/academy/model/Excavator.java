package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int carryingCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int carryingCapacity) {
        super(name, color);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
