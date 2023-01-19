package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String countryOfRegistration;
    private double trailerVolume;

    public Truck() {
    }

    public Truck(String name, String color, double fuelVolume,
                 String countryOfRegistration, double trailerVolume) {
        super(name, color, fuelVolume);
        this.countryOfRegistration = countryOfRegistration;
        this.trailerVolume = trailerVolume;
    }

    public String getCountryOfRegistration() {
        return countryOfRegistration;
    }

    public void setCountryOfRegistration(String countryOfRegistration) {
        this.countryOfRegistration = countryOfRegistration;
    }

    public double getTrailerVolume() {
        return trailerVolume;
    }

    public void setTrailerVolume(double trailerVolume) {
        this.trailerVolume = trailerVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
