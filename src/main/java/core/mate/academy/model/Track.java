package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String manufacturer;
    private int manufacturingYear;

    public Track(String manufacturer, int manufacturingYear) {
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
    }

    public Track() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
