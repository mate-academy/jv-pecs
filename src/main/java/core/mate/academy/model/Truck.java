package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int enginePower;
    private int weight;

    public Truck() {
    }

    public Truck(String name, String color, int enginePower, int weight) {
        super(name,color);
        this.enginePower = enginePower;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
