package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int loadCapacity;
    private int enginePower;
    private String engineType;

    public Truck() {
    }

    public Truck(int loadCapacity, int enginePower, String engineType) {
        this.loadCapacity = loadCapacity;
        this.enginePower = enginePower;
        this.engineType = engineType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
