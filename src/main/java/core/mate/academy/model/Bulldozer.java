package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    public static final int DEFAULT_WEIGHT = 30_000;
    
    private int weight = DEFAULT_WEIGHT;

    public Bulldozer() {
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer weighting " + weight + " tons started to work");
    }
}
