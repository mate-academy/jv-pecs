package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int bodyVolume;

    public Truck(String name, String color, int bodyVolume) {
        super(name, color);
        this.bodyVolume = bodyVolume;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(int bodyVolume) {
        this.bodyVolume = bodyVolume;
    }
}
