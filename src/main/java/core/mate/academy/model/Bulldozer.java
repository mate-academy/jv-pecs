package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String typeBlade;
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(String typeBlade, int power) {
        this.typeBlade = typeBlade;
        this.power = power;

    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
