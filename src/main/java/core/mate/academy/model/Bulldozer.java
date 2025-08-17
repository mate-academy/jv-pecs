package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private String sizeBasket;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String sizeBasket) {
        super(name, color);
        this.sizeBasket = sizeBasket;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
