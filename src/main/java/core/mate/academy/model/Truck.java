package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxWeight;

    public Truck() {
    }

    public Truck(String name, String color, int maxWeight) {
        super(name, color);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxPower) {
        this.maxWeight = maxPower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
