package core.mate.academy.model;

public class Truck extends Machine {
    private double loadTons;
    private double maxSpeed;
    private String bodyType;

    public Truck(double loadTons, double maxSpeed, String bodyType,
                 String name, String color) {
        super(name, color);
        this.loadTons = loadTons;
        this.maxSpeed = maxSpeed;
        this.bodyType = bodyType;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
