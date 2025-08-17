package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int horsepower;
    private double engineVolume;

    public Truck() {
    }

    public Truck(int horsepower, double engineVolume, String color) {
        this.horsepower = horsepower;
        this.engineVolume = engineVolume;
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
