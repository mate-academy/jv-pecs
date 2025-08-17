package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int yearProduct;
    private int weight;

    public Bulldozer() {

    }

    public Bulldozer(int yearProduct, int weight) {
        this.yearProduct = yearProduct;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
