package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String manufacturer;
    private int buckedWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String manufacturer, int buckedWidth) {
        super(name);
        this.manufacturer = manufacturer;
        this.buckedWidth = buckedWidth;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getBuckedWidth() {
        return buckedWidth;
    }

    public void setBuckedWidth(int buckedWidth) {
        this.buckedWidth = buckedWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
