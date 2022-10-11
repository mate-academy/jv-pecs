package core.mate.academy.model;

public class Truck extends Machine {
    private double weight;
    private String bodyType;

    public Truck() {
    }

    public Truck(String name, String color, double weight, String bodyType) {
        super(name, color);
        this.weight = weight;
        this.bodyType = bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
