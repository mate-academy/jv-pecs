package core.mate.academy.model;

public class Truck extends Machine {
    private String cabType;
    private int basketSize;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
