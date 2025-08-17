package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private String brand;
    private int cost;

    public Bulldozer(String name, String color, String brand, int cost) {
        super(name, color);
        this.brand = brand;
        this.cost = cost;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
