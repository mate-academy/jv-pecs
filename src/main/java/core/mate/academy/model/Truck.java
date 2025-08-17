package core.mate.academy.model;

public class Truck extends Machine {
    private double lengthTruck;
    private String name;
    private String color;

    public Truck() {
    }

    public Truck(String name, String color, double lengthTruck) {
        this.name = name;
        this.color = color;
        this.lengthTruck = lengthTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
