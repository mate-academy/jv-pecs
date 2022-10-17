package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private final int weight;

    public Bulldozer() {
        weight = 30;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer weighting " + weight + " tons started to work");
    }
}
