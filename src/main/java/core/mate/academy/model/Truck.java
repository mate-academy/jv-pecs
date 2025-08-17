package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int weight;
    private double length;

    public Truck() {
    }

    public Truck(int weight, double length) {
        this.weight = weight;
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public Truck setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public double getLength() {
        return length;
    }

    public Truck setLength(double length) {
        this.length = length;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
