package core.mate.academy.model;

public class Truck extends Machine {

    private String name;
    private String color;

    public Truck(String name, String bodyTypes) {
        this.name = name;
        this.color = bodyTypes;
    }

    public Truck() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
