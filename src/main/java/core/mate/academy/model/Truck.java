package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxPayload;
    private String cargoType;

    public Truck() {
        super();
    }

    public Truck(String name, String color, int maxPayload, String cargoType) {
        super(name, color);
        this.maxPayload = maxPayload;
        this.cargoType = cargoType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
