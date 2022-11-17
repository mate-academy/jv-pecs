package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearProduction;
    private String serviceCountry;

    public Truck(int yearProduction, String serviceCountry) {
        this.yearProduction = yearProduction;
        this.serviceCountry = serviceCountry;
    }

    public Truck() {
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getServiceCountry() {
        return serviceCountry;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
