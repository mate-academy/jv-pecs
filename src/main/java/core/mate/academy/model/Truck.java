package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String body;

    public Truck() {
    }

    public Truck(String name, String color, String body) {
        super(name, color);
        this.body = body;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
