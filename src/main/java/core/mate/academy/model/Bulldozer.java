package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int year;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year) {
        super(name, color);
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
