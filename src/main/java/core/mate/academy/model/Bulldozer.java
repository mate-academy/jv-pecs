package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int maxSpeed;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int maxSpeed) {
        super(name, color);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
