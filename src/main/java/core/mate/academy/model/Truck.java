package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int containerVolume;

    public Truck() {
    }

    public Truck(String name, String color, int containerVolume) {
        super(name, color);
        this.containerVolume = containerVolume;
    }

    public int getContainerVolume() {
        return containerVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
