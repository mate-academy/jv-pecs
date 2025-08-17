package core.mate.academy.model;

public class Truck extends Machine {
    private double shippingCargoWeight;

    public Truck(Double shippingCargoWeight, String name, String color) {
        super(name,color);
        this.shippingCargoWeight = shippingCargoWeight;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
