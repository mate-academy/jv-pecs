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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }

    public int getWidthShowel() {
        return widthShowel;
    }

    public void setWidthShowel(int widthShowel) {
        this.widthShowel = widthShowel;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
