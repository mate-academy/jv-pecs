package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int power;
    private int mass;
    private int dumpDeepening;

    public Bulldozer() {
    }

    public Bulldozer(int power, int mass, int dumpDeepening) {
        this.power = power;
        this.mass = mass;
        this.dumpDeepening = dumpDeepening;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
