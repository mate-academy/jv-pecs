package core.mate.academy.model;

public class Truck extends Machine {
    private String manufacturer;
    private int size;

    public Truck(String name, String color, String manufacturer, int size) {
        super(name, color);
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
