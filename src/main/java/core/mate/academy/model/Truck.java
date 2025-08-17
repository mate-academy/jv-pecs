package core.mate.academy.model;

public class Truck extends Machine {
    private int numberAxles;

    public Truck() {
        this.numberAxles = 2;
    }

    public Truck(int numberAxles) {
        this.numberAxles = numberAxles;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
