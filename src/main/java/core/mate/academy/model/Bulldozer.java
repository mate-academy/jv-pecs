package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double litersPerHour;

    public Bulldozer() {
    }

    public Bulldozer(double littersPerHour, String color, String name) {
        this.litersPerHour = littersPerHour;
        setColor(color);
        setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work.");
    }
}
