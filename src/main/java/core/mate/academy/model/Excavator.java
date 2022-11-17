package core.mate.academy.model;

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
