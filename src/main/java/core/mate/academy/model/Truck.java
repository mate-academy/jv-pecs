package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volume;
    private int maxSpeed;

    public Truck() {
    }

    private Truck(int volume, int maxSpeed) {
        this.volume = volume;
        this.maxSpeed = maxSpeed;
    }

    public static Truck of(int volume, int maxSpeed) {
        return new Truck(volume, maxSpeed);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
