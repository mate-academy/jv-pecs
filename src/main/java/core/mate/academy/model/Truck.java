package core.mate.academy.model;

public class Truck extends Machine {
    private String brand;
    private int loadCapacity;

    public Truck(String name, String color, String brand, int loadCapacity) {
        super(name, color);
        this.brand = brand;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
