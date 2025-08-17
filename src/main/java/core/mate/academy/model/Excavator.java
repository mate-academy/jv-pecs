package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;
    private double hoursePower;

    public Excavator() {
    }

    public Excavator(String name, String color, int year, double hoursePower) {
        super.setName(name);
        super.setColor(color);
        this.year = year;
        this.hoursePower = hoursePower;
    }

    public int getYear() {
        return year;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
