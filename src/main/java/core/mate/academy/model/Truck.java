package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;
    private int volume;

    public Truck() {
    }

    public Truck(String model, int volume) {
        this.model = model;
        this.volume = volume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
