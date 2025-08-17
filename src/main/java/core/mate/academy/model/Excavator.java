package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine implements Workable {
    private String excavatorType;

    public Excavator() {
    }

    public Excavator(String name, String color, String excavatorType) {
        super(name, color);
        this.excavatorType = excavatorType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
