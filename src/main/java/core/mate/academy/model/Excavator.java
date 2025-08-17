package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;
    private String country;

    public Excavator() {
    }

    public Excavator(String name, String color, int year, String country) {
        super(name, color);
        this.year = year;
        this.country = country;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
