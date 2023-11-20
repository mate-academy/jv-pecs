package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private boolean isEcoFriendly;

    public Bulldozer() {
    }

    public Bulldozer(String engine, int maxSpeedKmH, boolean isEcoFriendly) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.isEcoFriendly = isEcoFriendly;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
