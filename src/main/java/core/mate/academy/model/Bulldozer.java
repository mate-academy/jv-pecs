package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    int weight;
    String model;

    public Bulldozer() {
    }

    public Bulldozer(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
