package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String manufacturer;
    private int manufacturingYear;

    public Bulldozer(String manufacturer, int manufacturingYear) {
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
    }

    public Bulldozer() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
