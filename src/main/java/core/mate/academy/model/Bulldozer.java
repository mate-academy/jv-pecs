package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasWheels;

    public Bulldozer(boolean hasWheels, String name, String color) {
        this.hasWheels = hasWheels;
        setName(name);
        setColor(color);
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
