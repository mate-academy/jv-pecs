package core.mate.academy.model;

public class Bulldozer extends Machine {
    private double bulldozerCapacity;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double bulldozerCapacity) {
        setName(name);
        setColor(color);
        this.bulldozerCapacity = bulldozerCapacity;
    }

    public double getBulldozerCapacity() {
        return bulldozerCapacity;
    }

    public void setBulldozerCapacity(double bulldozerCapacity) {
        this.bulldozerCapacity = bulldozerCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
