package core.mate.academy.model;

public class Truck extends Machine {
    private boolean hasBody;

    public Truck(boolean hasBody, String name, String color) {
        this.hasBody = hasBody;
        setName(name);
        setColor(color);
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
