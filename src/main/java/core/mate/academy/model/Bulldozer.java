package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private final int power;
    private final String brand;

    public Bulldozer(String name, String color, int power, String brand) {
        super(name, color);
        this.power = power;
        this.brand = brand;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
