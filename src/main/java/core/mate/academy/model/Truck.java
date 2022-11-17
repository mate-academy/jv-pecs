package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearProduction;
    private String Country;

    public Truck(int yearProduction, String Country) {
        this.yearProduction = yearProduction;
        this.Country = Country;
    }

    public Truck() {
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getCountry() {
        return Country;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
