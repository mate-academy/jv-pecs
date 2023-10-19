package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weight;
    private int height;
    private int width;

    public Bulldozer(int weight, int height, int width) {
        this.weight = weight;
        this.height = height;
        this.width = width;
    }

    public Bulldozer() {
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
