package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int manufacturingYear;
    private String owner;

    public Excavator(String name, String color, int manufacturingYear, String owner) {
        super(name, color);
        this.manufacturingYear = manufacturingYear;
        this.owner = owner;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
