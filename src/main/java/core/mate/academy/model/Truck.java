package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckBodyType;

    public Truck() {
    }

    public Truck(String name, String color, String truckBodyType) {
        this.setName(name);
        this.setColor(color);
        this.truckBodyType = truckBodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
