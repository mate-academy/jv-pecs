package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int year;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int year) {
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
        System.out.println("Bulldozer started to work");
    }
}
