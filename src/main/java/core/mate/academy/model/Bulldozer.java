package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bulldozerYear;

    public Bulldozer(String name, String color, int bulldozerYear) {
        super(name, color);
        this.bulldozerYear = bulldozerYear;
    }

    public Bulldozer() {
    }

    public int getBulldozerYear() {
        return bulldozerYear;
    }

    public void setBulldozerYear(int bulldozerYear) {
        this.bulldozerYear = bulldozerYear;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
