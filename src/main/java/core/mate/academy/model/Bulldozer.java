package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static int weightTonns;

    public Bulldozer() {

    }

    public Bulldozer(String color, String name, int weightTonns) {
        super(name, color);
        this.weightTonns = weightTonns;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
