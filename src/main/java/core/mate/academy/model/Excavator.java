package core.mate.academy.model;

public class Excavator extends Machine {
    private int carrying;
    private int radius;

    public Excavator() {
    }

    public Excavator(String name, String color, int carrying, int radius) {
        super(name, color);
        this.carrying = carrying;
        this.radius = radius;
    }

    public int getHeight() {
        return carrying;
    }

    public void setHeight(int carrying) {
        this.carrying = carrying;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
