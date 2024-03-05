package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int bodyVolume;
    private boolean hasTrailer;

    public Truck() {

    }

    public Truck(String color, String name, int bodyVolume, boolean hasTrailer) {
        setColor(color);
        setName(name);
        this.bodyVolume = bodyVolume;
        this.hasTrailer = hasTrailer;
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

    public boolean getHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
}
