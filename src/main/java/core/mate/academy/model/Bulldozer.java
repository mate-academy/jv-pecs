package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int fuelCapacity;
    private int speed;

    public Bulldozer() {
    }

    public Bulldozer(int fuelCapacity, int speed) {
        this.fuelCapacity = fuelCapacity;
        this.speed = speed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
