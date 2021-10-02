package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bladeSize;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int bladeSize) {
        super(name, color);
        this.bladeSize = bladeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
