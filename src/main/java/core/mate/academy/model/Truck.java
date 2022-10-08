package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volume;

    public Truck() {
    }

    public Truck(int volume) {
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
