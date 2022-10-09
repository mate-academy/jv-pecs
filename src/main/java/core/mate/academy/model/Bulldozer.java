package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int year;

    public Bulldozer(int year) {
        super();
        this.year = year;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
