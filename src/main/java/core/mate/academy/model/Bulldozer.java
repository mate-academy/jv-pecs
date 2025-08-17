package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String brand;
    private int yearIssue;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String brand, int yearIssue) {
        super(name, color);
        this.brand = brand;
        this.yearIssue = yearIssue;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
