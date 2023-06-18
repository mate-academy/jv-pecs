package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int yearProduct;
    private int price;

    public Truck(int yearProduct, int price) {
        this.yearProduct = yearProduct;
        this.price = price;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
