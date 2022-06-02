package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int enginePower;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int enginePower, int weight) {
        super(name,color);
        this.enginePower = enginePower;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
