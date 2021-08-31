package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int weight;
    private String engineModel;

    public Truck(String name, String color, int weight, String engineModel) {
        super(name, color);
        this.weight = weight;
        this.engineModel = engineModel;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
