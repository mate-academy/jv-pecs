package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int year;
    private double hoursePower;
    private int widthShowel;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year, double hoursePower, int widthShowel) {
        super.setName(name);
        super.setColor(color);
        this.year = year;
        this.hoursePower = hoursePower;
        this.widthShowel = widthShowel;
    }

    public int getYear() {
        return year;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    public int getWidthShowel() {
        return widthShowel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
