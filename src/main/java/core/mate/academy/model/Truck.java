package core.mate.academy.model;

public class Truck extends Machine {
    private int carrying;

    public Truck(String name, String color, int carrying) {
        super(name, color);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
