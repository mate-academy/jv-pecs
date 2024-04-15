package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerYear;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bulldozerYear) {
        super(name, color);
        this.bulldozerYear = bulldozerYear;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
