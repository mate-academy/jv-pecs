package core.mate.academy.model;

public class Truck extends Machine {
    private int power;

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public void setPower(int power) {
        this.power = power;
    }
}
