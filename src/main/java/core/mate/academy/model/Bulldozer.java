package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int yearOfProduction;
    private int bladeWidth;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int yearOfProduction, int bladeWidth) {
        super(name, color);
        this.yearOfProduction = yearOfProduction;
        this.bladeWidth = bladeWidth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
