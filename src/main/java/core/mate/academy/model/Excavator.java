package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int fuelCapacity;
    private int powerEngine;
    private int weight;

    public Excavator() {
    }

    public Excavator(int fuelCapacity, int powerEngine, int weight) {
        this.fuelCapacity = fuelCapacity;
        this.powerEngine = powerEngine;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
