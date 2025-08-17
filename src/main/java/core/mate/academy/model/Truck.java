package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int maxLoad;
    private int maxCargoVolume;

    public Truck() {
    }

    public Truck(int maxLoad, int maxCargoVolume) {
        this.maxLoad = maxLoad;
        this.maxCargoVolume = maxCargoVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
