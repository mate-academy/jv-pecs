package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int year;
    private String country;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year, String country) {
        super(name, color);
        this.year = year;
        this.country = country;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
