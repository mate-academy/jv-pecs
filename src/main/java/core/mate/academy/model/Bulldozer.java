package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeCapacity;
    private boolean isTrack;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String manufacturer,
                     double bladeCapacity, boolean isTrack) {
        super(name, color, manufacturer);
        this.bladeCapacity = bladeCapacity;
        this.isTrack = isTrack;
    }

    public double getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(double bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    public boolean isTrack() {
        return isTrack;
    }

    public void setTrack(boolean track) {
        isTrack = track;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
