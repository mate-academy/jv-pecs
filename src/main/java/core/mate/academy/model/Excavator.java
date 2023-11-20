package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private static final int MAX_BUCKET_VOLUME = 500;
    private double bucketVolume;
    private Random random = new Random();

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketVolume) {
        super(name, color);
        this.bucketVolume = bucketVolume;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public double getRandomBucketVolume() {
        return random.nextInt(MAX_BUCKET_VOLUME);
    }
}
