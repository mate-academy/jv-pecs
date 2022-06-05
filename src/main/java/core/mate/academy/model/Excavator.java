package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int arrowLength;

    public Excavator() {
    }

    public Excavator(String name, String color, int arrowLength) {
        super(name, color);
        this.arrowLength = arrowLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
