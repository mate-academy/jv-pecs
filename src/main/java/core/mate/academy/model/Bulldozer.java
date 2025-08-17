package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private int enginePower;
    private double height;

    public Bulldozer(int weight, int enginePower, double height) {
        this.weight = weight;
        this.enginePower = enginePower;
        this.height = height;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
