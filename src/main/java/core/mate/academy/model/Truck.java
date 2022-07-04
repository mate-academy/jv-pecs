package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int volumeOfCargoCompartment;

    public Truck() {
    }

    public Truck(String name, String color, int volumeOfCargoCompartment) {
        super(name, color);
        this.volumeOfCargoCompartment = volumeOfCargoCompartment;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
