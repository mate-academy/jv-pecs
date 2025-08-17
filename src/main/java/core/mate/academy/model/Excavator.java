package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;
    private String fuel;

    public Excavator(int year, String fuel) {
        this.year = year;
        this.fuel = fuel;
    }

    public Excavator() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
