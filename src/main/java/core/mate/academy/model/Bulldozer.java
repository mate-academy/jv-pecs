package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeBulldozer;
    private int weightBulldozer;

    public Bulldozer() {
    }

    public Bulldozer(String typeBulldozer, int weightBulldozer) {
        this.typeBulldozer = typeBulldozer;
        this.weightBulldozer = weightBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
