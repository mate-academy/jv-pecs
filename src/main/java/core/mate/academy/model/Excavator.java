package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String countryOfProduction;
    private double workSpeed;

    public Excavator() {
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public void setCountryOfProduction(String countryOfProduction) {
        this.countryOfProduction = countryOfProduction;
    }

    public double getWorkSpeed() {
        return workSpeed;
    }

    public void setWorkSpeed(double workSpeed) {
        this.workSpeed = workSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
