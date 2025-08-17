package core.mate.academy.model;

public class Truck extends Machine {
    private int wheels;

    public Truck() {
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
