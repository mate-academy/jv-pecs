package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private static final int MAX_TRAILER_VOLUME = 500;
    private double trailerVolume;
    private Random random = new Random();

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

    public double getRandomTrailerVolume() {
        return random.nextInt(MAX_TRAILER_VOLUME);
    }
}
