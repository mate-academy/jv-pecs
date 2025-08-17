package core.mate.academy.model;

public class Truck extends Machine {
    private int horsePower;
    private int numberOfWheels;

    public Truck(int horsePower, int numberOfWheels) {
        this.horsePower = horsePower;
        this.numberOfWheels = numberOfWheels;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
