package core.mate.academy.model;

public class Truck extends Machine {
    String transmission;
    String bodyType;
    String cabType;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
