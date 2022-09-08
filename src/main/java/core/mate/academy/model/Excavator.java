package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int maxLength;

    public Excavator() {
        super();
    }

    public Excavator(String name, String color, int maxLength) {
        super(name, color);
        this.maxLength = maxLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
