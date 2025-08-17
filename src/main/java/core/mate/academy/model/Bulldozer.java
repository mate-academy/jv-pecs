package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasWheels;
    private boolean hasPlower;

    public Bulldozer(boolean hasWheels, boolean hasPlower, String name, String color) {
        super(name, color);
        this.hasWheels = hasWheels;
        this.hasPlower = hasPlower;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
