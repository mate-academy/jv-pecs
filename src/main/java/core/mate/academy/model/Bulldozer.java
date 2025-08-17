package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int year;

    public Bulldozer(String name, String color, int year) {
        super(name, color);
        this.year = year;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
