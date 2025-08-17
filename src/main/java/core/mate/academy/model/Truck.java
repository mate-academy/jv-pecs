package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double luggageVolume;

    public Truck() {
    }

    public Truck(String name, String color, double luggageVolume) {
        this.luggageVolume = luggageVolume;
        setName(name);
        setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
