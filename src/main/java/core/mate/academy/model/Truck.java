package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double carrying;

    public Truck() {
    }

    public Truck(String name, String color, double carrying) {
        super(name, color);
        this.carrying = carrying;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }
}
