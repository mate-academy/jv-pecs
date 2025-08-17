package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozerBrand;
    private String name;
    private String color;

    public Bulldozer() {
    }

    public Bulldozer(String bulldozerBrand, String name, String color) {
        this.bulldozerBrand = bulldozerBrand;
        this.name = name;
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
