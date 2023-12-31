package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String brand;
    private String gasoline;

    public Truck() {
    }

    public Truck(String brand, String gasoline, String name, String color) {
        this.brand = brand;
        this.gasoline = gasoline;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
