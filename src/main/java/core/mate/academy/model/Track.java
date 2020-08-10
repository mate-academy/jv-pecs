package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Track
 * Do not remove no-field constructor
 */
public class Track extends Machine {
    private String brand;
    private int productionYear;

    public Track() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Track(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
