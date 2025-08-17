package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String nameBrand;
    private String model;
    private String manufacturerCountry;
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(String nameBrand, String model, String manufacturerCountry, int power) {
        this.nameBrand = nameBrand;
        this.model = model;
        this.manufacturerCountry = manufacturerCountry;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
