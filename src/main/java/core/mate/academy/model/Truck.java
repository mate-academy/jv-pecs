package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;

    public Truck() {
        this("DefaultModel", "DefaultColor", 0);
    }

    public Truck(String model, String color, int loadCapacity) {
        setName(model);
        setColor(color);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + getName() + " is working.");
    }
}
