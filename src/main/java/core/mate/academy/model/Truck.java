package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String brand;
    private int buildYear;
    private String condition;
    private String fuelType;

    public Truck(String brand, int buildYear, String condition, String fuelType) {
        this.brand = brand;
        this.buildYear = buildYear;
        this.condition = condition;
        this.fuelType = fuelType;
    }

    public Truck() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
