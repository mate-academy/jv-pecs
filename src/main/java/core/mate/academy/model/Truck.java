package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int power;
    private String fuel;

    public Truck() {
    }

    public Truck(String color, String name, int power, String fuel) {
        super(color, name);
        this.power = power;
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
