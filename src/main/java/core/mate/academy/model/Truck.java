package core.mate.academy.model;

public class Truck extends Machine {
    private int size;
    private String typeOfEngine;

    public Truck() {
    }

    public Truck(String name, String color, int size, String typeOfEngine) {
        super(name,color);
        this.size = size;
        this.typeOfEngine = typeOfEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
