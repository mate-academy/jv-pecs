package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String excavatorBrand;
    private String name;
    private String color;

    public Excavator() {
    }

    public Excavator(String excavatorBrand, String name, String color) {
        this.excavatorBrand = excavatorBrand;
        this.name = name;
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
