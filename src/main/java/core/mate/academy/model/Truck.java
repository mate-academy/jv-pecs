package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String cockpitColor;
    private int cockpitVolume;

    public Truck() {
    }

    public String getCockpitColor() {
        return cockpitColor;
    }

    public void setCockpitColor(String cockpitColor) {
        this.cockpitColor = cockpitColor;
    }

    public int getCockpitVolume() {
        return cockpitVolume;
    }

    public void setCockpitVolume(int cockpitVolume) {
        this.cockpitVolume = cockpitVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
