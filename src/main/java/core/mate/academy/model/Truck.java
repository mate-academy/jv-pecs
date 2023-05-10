package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String truckType;
    private int numOfWheels;
    private int maxWeight;

    public Truck() {
        super();
    }

    public Truck(String truckType, String color, int numOfWheels, int maxWeight) {
        super(truckType, color);
        this.truckType = truckType;
        this.numOfWheels = numOfWheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
