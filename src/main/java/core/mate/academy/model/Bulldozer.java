package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private String country;

    public Bulldozer() {
    }

    public Bulldozer(String brand, String country) {
        this.brand = brand;
        this.country = country;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
