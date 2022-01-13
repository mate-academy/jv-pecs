package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int timeSinceNew;
    private int weight;

    public Bulldozer(String name, String color, int timeSinceNew, int weight) {
        super(name, color);
        this.timeSinceNew = timeSinceNew;
        this.weight = weight;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
