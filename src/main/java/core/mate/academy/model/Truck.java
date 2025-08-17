package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String nameBrand;
    private String model;
    private String manufacturerCountry;
    private int power;

    public Truck() {
    }

    public Truck(String nameBrand, String model, String manufacturerCountry, int power) {
        this.nameBrand = nameBrand;
        this.model = model;
        this.manufacturerCountry = manufacturerCountry;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
