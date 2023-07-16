package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String name;
    private String color;
    private int yearOfProduction;
    private int bladeWidth;

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
