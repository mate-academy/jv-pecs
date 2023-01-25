package core.mate.academy.model;

public class Truck extends Machine {
    private double shippingCargoWeight;

    public Truck(Double shippingCargoWeight, String setName, String setColor) {
        this.shippingCargoWeight = shippingCargoWeight;
        super.setName(setName);
        super.setColor(setColor);
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
