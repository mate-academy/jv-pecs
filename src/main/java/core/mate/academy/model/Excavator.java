package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int yearService;
    private String countryOrigin;

    public Excavator(int yearService, String countryOrigin) {
        this.yearService = yearService;
        this.countryOrigin = countryOrigin;
    }
    public Excavator() {
    }

    public int getYearService() {
        return yearService;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
