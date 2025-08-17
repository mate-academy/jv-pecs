package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String type;
    private int powerEngine;

    public Bulldozer() {
    }

    public Bulldozer(String type, int powerEngine) {
        this.type = type;
        this.powerEngine = powerEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
