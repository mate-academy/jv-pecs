package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String sizeBasket;

    public Excavator() {
    }

    public Excavator(String name, String color, String sizeBasket) {
        super(name, color);
        this.sizeBasket = sizeBasket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
