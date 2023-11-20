package core.mate.academy.model;

public class Truck extends Machine {
    private String model;
    private double price;

    public Truck() {
    }

    public Truck(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
