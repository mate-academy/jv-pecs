package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int price;

    public Bulldozer() {
        super("Name", "color");
    }

    public Bulldozer(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
