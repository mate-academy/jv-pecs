package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;
    private double capacity;
    private int weight;

    public Truck() {
    }

    public Truck(String model, double capacity, int weight) {
        this.model = model;
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
