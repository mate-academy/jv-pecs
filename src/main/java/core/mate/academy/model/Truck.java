package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoadWeight;

    public Truck() {
    }

    public Truck(String name, String color, int maxLoadWeight) {
        super.setName(name);
        super.setColor(color);
        this.maxLoadWeight = maxLoadWeight;
    }

    public void setMaxLoadWeight(int maxLoadWeight) {
        this.maxLoadWeight = maxLoadWeight;
    }

    public int getMaxLoadWeight() {
        return maxLoadWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
