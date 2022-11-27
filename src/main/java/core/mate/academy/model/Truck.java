package core.mate.academy.model;

public class Truck extends Machine {
    private String owner;
    private int power;

    public Truck() {
    }

    public Truck(String name, String color, String owner, int power) {
        constructor();
        this.owner = owner;
        this.power = power;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
