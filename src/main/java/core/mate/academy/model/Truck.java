package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String fuel;

    public Truck() {
    }

    public Truck(String name, String color, int price, String fuel) {
        super(name, color, price);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
