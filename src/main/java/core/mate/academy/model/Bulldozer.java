package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private boolean caterpillars;

    public Bulldozer() {

    }

    public Bulldozer(int weight, boolean caterpillars) {
        this.weight = weight;
        this.caterpillars = caterpillars;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
