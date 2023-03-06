package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorPower;

    public Excavator() {
    }

    public Excavator(String name, String color, int excavatorPower) {
        super(name, color);
        this.excavatorPower = excavatorPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
