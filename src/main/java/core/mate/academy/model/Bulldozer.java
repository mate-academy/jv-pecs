package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
