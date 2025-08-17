package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String country;
    private int year;

    public Bulldozer() {
    }

    public Bulldozer(String country, int year,String name,String color) {
        this.country = country;
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
