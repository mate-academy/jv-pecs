package core.mate.academy.model;

public class Truck extends Machine {
    private String cabLocation;
    private String bodyType;

    public Truck() {
    }

    public Truck(String cabLocation, String bodyType) {
        this.bodyType = bodyType;
        this.cabLocation = cabLocation;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
