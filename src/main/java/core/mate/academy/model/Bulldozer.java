package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double speed;
    private String type;

    public Bulldozer() {
    }

    public Bulldozer(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
