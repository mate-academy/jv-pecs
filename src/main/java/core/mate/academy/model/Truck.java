package core.mate.academy.model;

public class Truck extends Machine {
    private int lorryCapacity;

    public Truck() {
    }

    public Truck(int lorryCapacity, String name, String color) {
        this.lorryCapacity = lorryCapacity;
        super.setName(name);
        super.setName(color);
    }

    public int getLorryCapacity() {
        return lorryCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
