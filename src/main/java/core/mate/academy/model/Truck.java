package core.mate.academy.model;

public class Truck extends Machine {
    private double maxLoad;

    public Truck(String name, String color, double maxLoad) {
        super(name, color);
        this.maxLoad = maxLoad;
    }

    public Truck() {
        super("Truck", "Yellow");
    }

    @Override
    public void doWork() {
        System.out.println("Truck " + getName() + " started to work");
    }
}
