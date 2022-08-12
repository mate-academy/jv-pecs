package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volume;
    private int loadCapacity;

    public Truck() {
        super();
    }

    public Truck(String name, String color, int volume, int loadCapacity) {
        super(name, color);
        this.volume = volume;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
