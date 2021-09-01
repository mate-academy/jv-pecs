package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasWheels;
    private boolean hasPlower;

    public Bulldozer(boolean hasWheels, boolean hasPlower, String name, String color) {
        this.hasWheels = hasWheels;
        this.hasPlower = hasPlower;
        super.setName(name);
        super.setColor(color);
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
