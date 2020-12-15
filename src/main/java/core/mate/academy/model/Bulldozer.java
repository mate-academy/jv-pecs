package core.mate.academy.model;

public class Bulldozer extends Machine {
    private boolean hasWheels;

    public Bulldozer(boolean hasWheels, String name, String color) {
        super(name, color);
        this.hasWheels = hasWheels;
    }

    public Bulldozer() {
    }

    public boolean isHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
