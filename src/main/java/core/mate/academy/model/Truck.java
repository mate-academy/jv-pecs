package core.mate.academy.model;

public class Truck extends Machine {
    private int vanVolume;

    public Truck() {
    }

    public Truck(int vanVolume) {
        this.vanVolume = vanVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
