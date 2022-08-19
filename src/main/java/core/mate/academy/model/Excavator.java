package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int power;
    private String name;

    public Excavator() {
    }

    public Excavator(String name, int power) {
        this.power = power;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
