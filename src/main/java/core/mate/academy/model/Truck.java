package core.mate.academy.model;

public class Truck extends Machine {
    private String fuelType;

    public Truck() {
    }

    public Truck(String name, String color, String fuelType) {
        super(name, color);
        this.fuelType = fuelType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
