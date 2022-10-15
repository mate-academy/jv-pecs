package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private double price;

    public Bulldozer() {
    }

    public Bulldozer(int weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
