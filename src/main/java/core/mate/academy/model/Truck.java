package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int mass;
    private double dragCoefficient;

    public Truck() {
    }

    public Truck(int mass, double dragCoefficient) {
        this.mass = mass;
        this.dragCoefficient = dragCoefficient;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
