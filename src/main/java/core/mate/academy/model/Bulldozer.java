package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int id;
    private String manufacturer;

    public Bulldozer(int id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public Bulldozer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
