package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeBlade;
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String typeBlade, int weight) {
        super(name, color);
        this.typeBlade = typeBlade;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
