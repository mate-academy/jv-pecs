package core.mate.academy.model;

public class Truck extends Machine {
    private String transmission;
    private String bodyType;
    private String cabType;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
