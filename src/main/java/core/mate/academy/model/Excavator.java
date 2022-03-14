package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Excavator(String name, String color, int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public Excavator() {}

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
