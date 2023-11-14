package core.mate.academy.model;

public class Truck extends Machine {
    private String width;
    private int height;

    public Truck() {
    }

    public Truck(String width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
