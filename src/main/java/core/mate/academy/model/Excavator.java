package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int manufacturingYear;

    public Excavator(String name, String color, int manufacturingYear) {
        super(name, color);
        this.manufacturingYear = manufacturingYear;
    }

    public Excavator() {
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
