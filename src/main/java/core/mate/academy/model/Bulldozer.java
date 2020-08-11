package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private String model;
    private int year;
    private int workHours;

    public Bulldozer() {
    }

    public Bulldozer(String model, int year, int workHours) {
        this.model = model;
        this.year = year;
        this.workHours = workHours;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
}
