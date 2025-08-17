package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int year;
    private int tonnage;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year, int tonnage) {
        super(name,color);
        this.year = year;
        this.tonnage = tonnage;
    }

    public int getYear() {
        return year;
    }

    public int getTonnage() {
        return tonnage;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
