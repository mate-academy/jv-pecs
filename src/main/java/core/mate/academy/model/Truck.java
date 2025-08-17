package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int weight;

    public Truck() {
    }

    public Truck(int weight, String color, String name) {
        this.weight = weight;
        setColor(color);
        setName(name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work.");
    }
}
