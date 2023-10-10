package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double trailerVolume;

    public Truck() {
    }

    public Truck(String name, String color, double trailerVolume) {
        super(name, color);
        this.trailerVolume = trailerVolume;
    }

    public double getTrailerVolume() {
        return trailerVolume;
    }

    public void setTrailerVolume(double trailerVolume) {
        this.trailerVolume = trailerVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
