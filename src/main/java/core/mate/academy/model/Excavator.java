package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int armLength;
    private String excavatorType;

    public Excavator(String name, String color, int armLength, String type) {
        super(name,color);
        this.armLength = armLength;
        this.excavatorType = type;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
