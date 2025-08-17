package core.mate.academy.model;

public class Truck extends Machine {
    private int year;

    public Truck() {
    }

    public Truck(String name, String color, int year) {
        super(name, color);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
