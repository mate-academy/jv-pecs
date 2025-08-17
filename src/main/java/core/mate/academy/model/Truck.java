package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerVolume;
    private int loadCapacity;

    public Truck() {
    }

    public Truck(int trailerVolume, int loadCapacity) {
        this.trailerVolume = trailerVolume;
        this.loadCapacity = loadCapacity;
    }

    public void setTrailerVolume(int trailerVolume) {
        this.trailerVolume = trailerVolume;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getTrailerVolume() {
        return trailerVolume;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
