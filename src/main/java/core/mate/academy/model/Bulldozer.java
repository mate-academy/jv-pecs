package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private int width;

    public Bulldozer() {
    }

    public Bulldozer(int weight, int width, String name, String color) {
        this.weight = weight;
        this.width = width;
        this.setName(name);
        this.setColor(color);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
