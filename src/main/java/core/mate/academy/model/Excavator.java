package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double engineVolume;
    private int year;

    public Excavator() {
        this.engineVolume = (0.5 + (6.0 - 0.5) * new Random().nextDouble());
        this.year = 1960 + (int) (Math.random() * 2022);
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
