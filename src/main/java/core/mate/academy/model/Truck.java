package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;
    private int bodyLength;

    public Truck() {
    }

    public Truck(String model, int bodyLength) {
        this.model = model;
        this.bodyLength = bodyLength;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
