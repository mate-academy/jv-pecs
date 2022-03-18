package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int power;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int power) {
        super(name, color);
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
