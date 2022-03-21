package core.mate.academy.model;

public class Truck extends Machine {
    private String model;

    public Truck() {
    }

    public Truck(String name, String color, String model) {
        super(name, color);
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
