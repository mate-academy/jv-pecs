package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int power, int weight) {
        super.setName(name);
        super.setColor(color);
        this.horsePower = power;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
