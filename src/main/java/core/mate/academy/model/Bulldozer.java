package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String color;
    private int year;
    private String name;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
