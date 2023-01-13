package core.mate.academy.model;

public class Truck extends Machine {

    private boolean loaded;
    private boolean onTheWay;
    private int speed;
    private String color;

    public Truck() {
    }

    public Truck(boolean loaded, boolean onTheWay, int speed, String color) {
        this.loaded = loaded;
        this.onTheWay = onTheWay;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
