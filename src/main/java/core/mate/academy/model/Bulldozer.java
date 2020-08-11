package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine {
    private int power;
    private String size;

    public Bulldozer() {
    }

    public Bulldozer(int power, String size) {
        this.power = power;
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
