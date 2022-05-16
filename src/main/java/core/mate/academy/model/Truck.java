package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String tankVolume;

    public Truck() {
    }

    public Truck(String name, String color, String tankVolume) {
        super(name, color);
        this.tankVolume = tankVolume;
    }

    public String getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(String tankVolume) {
        this.tankVolume = tankVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
