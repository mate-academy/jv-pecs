package core.mate.academy.model;

public class Truck extends Machine {
    private int kgOfMaterialCanTransport;
    private int maxSpeed;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
