package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int year;
    private String logo;

    public Truck() {
    }

    public Truck(String name, String color, int year, String logo) {
        super(name, color);
        this.year = year;
        this.logo = logo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
