package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckBrand;
    private String name;
    private String color;

    public Truck(String truckBrand, String name, String color) {
        this.truckBrand = truckBrand;
        this.name = name;
        this.color = color;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
