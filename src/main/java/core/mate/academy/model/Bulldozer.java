package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
