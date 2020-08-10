package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String manufacturer;
    private int manufacturingYear;

    public Excavator(String manufacturer, int manufacturingYear) {
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
    }

    public Excavator() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
