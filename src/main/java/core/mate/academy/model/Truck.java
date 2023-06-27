package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int trailerVolume;

    public Truck() {
    }

    public Truck(int trailerVolume) {
        this.trailerVolume = trailerVolume;
    }

    public int getTrailerVolume() {
        return trailerVolume;
    }

    public Truck setTrailerVolume(int trailerVolume) {
        this.trailerVolume = trailerVolume;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
