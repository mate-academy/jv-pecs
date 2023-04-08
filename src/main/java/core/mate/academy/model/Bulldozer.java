package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int manufactureYear;

    public Bulldozer(String name, String color, int manufactureYear) {
        super(name, color);
        this.manufactureYear = manufactureYear;
    }

    public Bulldozer() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
