package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int volumeOfPrism;

    public Excavator() {
    }

    public Excavator(String name, String color, int volumeOfPrism) {
        super(name, color);
        this.volumeOfPrism = volumeOfPrism;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
