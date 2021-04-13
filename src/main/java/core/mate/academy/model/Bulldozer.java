package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements MachineProducer<Bulldozer> {
    private double bucketVolume;

    public Bulldozer() {
    }

    public Bulldozer(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override

    public List<Bulldozer> get() {
        Bulldozer oneCubeBulldozer = new Bulldozer(1);
        Bulldozer oneAndHalfCubeBulldozer = new Bulldozer(1.5);
        return List.of(oneCubeBulldozer, oneAndHalfCubeBulldozer);
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }
}
