package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private float enginePower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, float enginePower) {
        super(name, color);
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
