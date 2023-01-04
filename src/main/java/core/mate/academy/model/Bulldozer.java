package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int year;
    private String driverName;

    public Bulldozer() {
    }

    public Bulldozer(int year, String driverName) {
        this.year = year;
        this.driverName = driverName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
