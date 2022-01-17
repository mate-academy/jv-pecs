package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double height;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double height) {
        super(name, color);
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
