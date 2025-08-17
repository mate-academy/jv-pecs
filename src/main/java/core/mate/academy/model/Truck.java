package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int ton;

    public Truck() {
        super("Name", "color");
    }

    public Truck(String name, String color, int ton) {
        super(name, color);
        this.ton = ton;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public void setTon(int ton) {
        this.ton = ton;
    }

    public int getTon() {
        return ton;
    }
}
