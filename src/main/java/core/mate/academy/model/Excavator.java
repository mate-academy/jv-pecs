package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int manufactureYear;

    public Excavator(String name, String color, int manufactureYear) {
        super(name, color);
        this.manufactureYear = manufactureYear;
    }

    public Excavator() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
