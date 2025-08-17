package core.mate.academy.model;

public class Truck extends Machine {
    private String type;
    private String color;

    public Truck() {

    }

    public Truck(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
