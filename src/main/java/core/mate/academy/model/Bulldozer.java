package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int fuelCapacity;
    private int powerEngine;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(int fuelCapacity, int powerEngine, int weight) {
        this.fuelCapacity = fuelCapacity;
        this.powerEngine = powerEngine;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
