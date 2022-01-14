package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String type;
    private int power;

    public Excavator() {
    }

    public Excavator(String name, String color, String type, int power) {
        super(name, color);
        this.type = type;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
