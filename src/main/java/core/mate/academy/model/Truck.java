package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    int yearProduction;
    String Manufacturer;
    public Truck(int yearProduction, String Manufacturer) {
        this.yearProduction = yearProduction;
        this.Manufacturer = Manufacturer;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getManufacturer() {
        return Manufacturer;
    }
    public Truck() {

    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
