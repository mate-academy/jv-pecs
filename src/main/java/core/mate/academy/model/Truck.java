package core.mate.academy.model;

public class Truck extends Machine {
    int truckCapasity;
    boolean work;

    public Truck() {
    }

    public Truck(String name, String color, int truckCapasity, boolean work) {
        super(name, color);
        this.truckCapasity = truckCapasity;
        this.work = work;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
