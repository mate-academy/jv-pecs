package core.mate.academy.model;

public class Truck extends Machine {
    public Truck() {
    }

    public Truck(String color, String name) {
        super.setColor(color);
        super.setName(name);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
