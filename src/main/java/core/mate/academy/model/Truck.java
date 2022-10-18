package core.mate.academy.model;

public class Truck extends Machine {
    private String type;

    public Truck() {
        this.type = "Truck";
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
