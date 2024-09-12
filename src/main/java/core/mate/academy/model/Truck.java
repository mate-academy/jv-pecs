package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int horsePower;
    private int mileage;
    private String model;

    public Truck() {
    }

    public Truck(int horsePower, int mileage, String model) {
        this.horsePower = horsePower;
        this.mileage = mileage;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
