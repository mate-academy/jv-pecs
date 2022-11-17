package core.mate.academy.model;

public class Excavator extends Machine {
    private int yearService;
    private String country;

    public Excavator(int yearService, String countryOrigin) {
        this.yearService = yearService;
        this.country = country;
    }

    public Excavator() {
    }

    public int getYearService() {
        return yearService;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
