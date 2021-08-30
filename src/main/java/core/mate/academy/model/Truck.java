package core.mate.academy.model;

public class Truck extends Machine {
    private int liftingCapacity;
    private int volume;

    public Truck() {
    }

    public Truck(int liftingCapacity, int volume) {
        this.liftingCapacity = liftingCapacity;
        this.volume = volume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
