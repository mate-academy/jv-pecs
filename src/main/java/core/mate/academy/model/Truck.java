package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxWeight;
    private int bodyCapacity;
    private String roadType;

    public Truck(int maxWeight, int bodyCapacity, String roadType) {
        this.maxWeight = maxWeight;
        this.bodyCapacity = bodyCapacity;
        this.roadType = roadType;
    }

    public Truck() {
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getBodyCapacity() {
        return bodyCapacity;
    }

    public String getRoadType() {
        return roadType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
