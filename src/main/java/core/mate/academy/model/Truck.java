package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int weightCapacity;

    public Truck() {
    }

    public Truck(String name, String color, int weightCapacity) {
        super(name, color);
        this.weightCapacity = weightCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }
}
