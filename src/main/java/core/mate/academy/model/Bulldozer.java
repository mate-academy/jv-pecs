package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double power;

    public Bulldozer(String name, String color, double power) {
        super(name, color);
        this.power = power;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
