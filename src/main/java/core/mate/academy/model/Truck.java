package core.mate.academy.model;

public class Truck extends Machine {
    private int amountOfWheels;

    public Truck(int amountOfWheels) {
        this.amountOfWheels = amountOfWheels;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
