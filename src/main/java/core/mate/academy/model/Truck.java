package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine implements Workable {
    private String truckTrailerType;

    public Truck() {
    }

    public Truck(String name, String color, String truckTrailerType) {
        super(name, color);
        this.truckTrailerType = truckTrailerType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
