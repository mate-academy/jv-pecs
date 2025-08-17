package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;

    public Excavator(String name, String color, int year) {
        super(name, color);
        this.year = year;
    }

    public Excavator() {
        super("Name", "color");
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
