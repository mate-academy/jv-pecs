package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private String brand;

    public Bulldozer() {
    }

    public Bulldozer(int weight, String brand) {
        this.weight = weight;
        this.brand = brand;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
